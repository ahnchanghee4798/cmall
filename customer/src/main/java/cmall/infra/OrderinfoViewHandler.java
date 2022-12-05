package cmall.infra;

import cmall.domain.*;
import cmall.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class OrderinfoViewHandler {

    @Autowired
    private OrderinfoRepository orderinfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderPlaced_then_CREATE_1 (@Payload OrderPlaced orderPlaced) {
        try {

            if (!orderPlaced.validate()) return;

            // view 객체 생성
            Orderinfo orderinfo = new Orderinfo();
            // view 객체에 이벤트의 Value 를 set 함
            orderinfo.setStatus("주문됨");
            // view 레파지 토리에 save
            orderinfoRepository.save(orderinfo);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenPaid_then_UPDATE_1(@Payload Paid paid) {
        try {
            if (!paid.validate()) return;
                // view 객체 조회
            Optional<Orderinfo> orderinfoOptional = orderinfoRepository.findById(Long.valueOf(paid.getOrderid()));

            if( orderinfoOptional.isPresent()) {
                 Orderinfo orderinfo = orderinfoOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderinfo.setStatus("결재됨");    
                // view 레파지 토리에 save
                 orderinfoRepository.save(orderinfo);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderRejected_then_UPDATE_2(@Payload OrderRejected orderRejected) {
        try {
            if (!orderRejected.validate()) return;
                // view 객체 조회
            Optional<Orderinfo> orderinfoOptional = orderinfoRepository.findById(Long.valueOf(orderRejected.getOrderid()));

            if( orderinfoOptional.isPresent()) {
                 Orderinfo orderinfo = orderinfoOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderinfo.setStatus("거절됨");    
                // view 레파지 토리에 save
                 orderinfoRepository.save(orderinfo);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }


}

