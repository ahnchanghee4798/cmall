package cmall.domain;

import cmall.domain.*;
import cmall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String foodid;
    private String address;
    private String customerid;
    private Object options;
    private Integer qty;
    private String orderId;
}


