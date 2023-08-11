package alyona.maskalenka.orm_example.service.mapper;

import alyona.maskalenka.orm_example.dto.StudentDTO;
import alyona.maskalenka.orm_example.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = GroupMapper.class)
public interface StudentMapper extends EntityMapper <StudentDTO, Student> {
    @Mapping(source = "name", target = "name")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "groupId", target = "studGroup.id")
    Student toEntity(StudentDTO studentDTO);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "studGroup.id", target = "groupId")
    StudentDTO toDto(Student student);
}
