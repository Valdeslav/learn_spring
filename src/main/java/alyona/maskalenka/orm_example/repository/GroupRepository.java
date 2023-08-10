package alyona.maskalenka.orm_example.repository;

import alyona.maskalenka.orm_example.entity.Group;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends BasicEntityRepository<Group> {
}
