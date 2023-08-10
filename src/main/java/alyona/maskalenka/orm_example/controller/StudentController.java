package alyona.maskalenka.orm_example.controller;

import alyona.maskalenka.orm_example.dto.StudentDTO;
import alyona.maskalenka.orm_example.entity.Student;
import alyona.maskalenka.orm_example.service.StudentService;
import alyona.maskalenka.orm_example.service.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    public StudentMapper studentMapper;

    @GetMapping
    public List<StudentDTO> getAll() {
        return studentService.findAll().stream()
                .map(studentMapper::toDto)
                .collect(Collectors.toList());
    }
}
