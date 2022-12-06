package cmall.domain;

import cmall.domain.*;
import cmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class TankytextTransed extends AbstractEvent {

    private Long id;

    public TankytextTransed(Tankytext aggregate){
        super(aggregate);
    }
    public TankytextTransed(){
        super();
    }
}
