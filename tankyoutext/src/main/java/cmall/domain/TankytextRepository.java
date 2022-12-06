package cmall.domain;

import cmall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="tankytexts", path="tankytexts")
public interface TankytextRepository extends PagingAndSortingRepository<Tankytext, Long>{

}
