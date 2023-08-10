package alyona.maskalenka.orm_example.service;

import alyona.maskalenka.orm_example.entity.BasicEntity;
import alyona.maskalenka.orm_example.repository.BasicEntityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class BasicServiceImpl<T extends BasicEntity> implements EntityService<T> {

    protected BasicEntityRepository<T> repository;

    public BasicServiceImpl(BasicEntityRepository<T> repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public T save(T object) {
        return repository.save(object);
    }

    @Override
    @Transactional
    public Page<T> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    @Transactional
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Optional<T> findOne(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
