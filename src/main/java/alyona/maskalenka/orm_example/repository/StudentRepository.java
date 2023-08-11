package alyona.maskalenka.orm_example.repository;

import alyona.maskalenka.orm_example.entity.StudGroup;
import alyona.maskalenka.orm_example.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends BasicEntityRepository<Student> {
    public List<Student> findByStudGroup(StudGroup studGroup);
}
