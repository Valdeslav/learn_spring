package alyona.maskalenka.orm_example.service;

import alyona.maskalenka.orm_example.entity.BasicEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface EntityService<T extends BasicEntity> {
    T save(T object);

    Page<T> findAll(Pageable pageable);

    List<T> findAll();

    Optional<T> findOne(Long id);

    void delete(Long id);
}
