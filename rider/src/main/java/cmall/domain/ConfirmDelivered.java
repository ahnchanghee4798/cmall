package cmall.domain;

import cmall.domain.*;
import cmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class ConfirmDelivered extends AbstractEvent {

    private Long id;
    private String status;
    private String orderId;
    private String address;

    public ConfirmDelivered(Delivery aggregate){
        super(aggregate);
    }
    public ConfirmDelivered(){
        super();
    }
}
