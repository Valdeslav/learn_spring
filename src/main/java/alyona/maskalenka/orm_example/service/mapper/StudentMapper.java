package alyona.maskalenka.orm_example.service.mapper;

import alyona.maskalenka.orm_example.dto.StudentDTO;
import alyona.maskalenka.orm_example.entity.Student;
import org.mapstruct.Mapper;

@Mapper(config = MapConfig.class, componentModel = "spring", uses = GroupMapper.class)
public interface StudentMapper extends EntityMapper <StudentDTO, Student> {
    Student toEntity(StudentDTO studentDTO);
    StudentDTO toDto(Student student);
}
