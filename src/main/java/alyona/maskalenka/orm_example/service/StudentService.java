package alyona.maskalenka.orm_example.service;

import alyona.maskalenka.orm_example.entity.Student;
import alyona.maskalenka.orm_example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends BasicServiceImpl<Student> {

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        super(studentRepository);
    }
}
