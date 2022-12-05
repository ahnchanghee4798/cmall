package cmall.domain;

import cmall.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String foodid;
    private String address;
    private String customerid;
    private List<String> options;
    private Integer qty;
    private String orderId;
}
