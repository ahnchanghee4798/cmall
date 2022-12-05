package cmall.domain;

import cmall.domain.*;
import cmall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private String status;
    private String foodid;
    private String orderid;
    private Object options;
    private String storeId;
    private Integer qty;
    private String customerId;
}


