package cmall.domain;

import cmall.domain.*;
import cmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private String status;
    private String foodid;
    private String orderid;
    private List<String> options;
    private String storeId;
    private Integer qty;
    private String customerId;

    public CookStarted(FoodCooking aggregate){
        super(aggregate);
    }
    public CookStarted(){
        super();
    }
}
