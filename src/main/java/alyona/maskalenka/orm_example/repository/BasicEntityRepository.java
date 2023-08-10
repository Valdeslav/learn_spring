package alyona.maskalenka.orm_example.repository;


import alyona.maskalenka.orm_example.entity.BasicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BasicEntityRepository<T extends BasicEntity> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {
}
