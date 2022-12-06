package cmall.domain;

import cmall.domain.*;
import cmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderUpdated extends AbstractEvent {

    private Long id;

    public OrderUpdated(Order aggregate){
        super(aggregate);
    }
    public OrderUpdated(){
        super();
    }
}
