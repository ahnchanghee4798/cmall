package cmall.domain;

import cmall.domain.*;
import cmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;
    private String status;
    private String foodid;
    private String orderid;
    private List<String> options;
    private Integer qty;
    private String storeId;
    private String customerId;

    public CookFinished(FoodCooking aggregate){
        super(aggregate);
    }
    public CookFinished(){
        super();
    }
}
