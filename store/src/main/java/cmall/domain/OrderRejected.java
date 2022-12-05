package cmall.domain;

import cmall.domain.*;
import cmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
    private String status;
    private String foodid;
    private String orderid;
    private List<String> options;
    private Integer qty;
    private String storeId;
    private String customerId;

    public OrderRejected(FoodCooking aggregate){
        super(aggregate);
    }
    public OrderRejected(){
        super();
    }
}
