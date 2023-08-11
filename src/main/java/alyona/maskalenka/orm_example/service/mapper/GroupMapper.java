package alyona.maskalenka.orm_example.service.mapper;

import alyona.maskalenka.orm_example.dto.StudGroupDTO;
import alyona.maskalenka.orm_example.entity.StudGroup;
import alyona.maskalenka.orm_example.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;

@Mapper(componentModel = "spring", uses = StudentMapper.class)
public interface GroupMapper extends EntityMapper<StudGroupDTO, StudGroup> {
    @Mapping(source = "number", target = "number")
    @Mapping(source = "students", target = "students")
    StudGroup toEntity(StudGroupDTO studentDTO);

    @Mapping(source = "number", target = "number")
    @Mapping(source = "students", target = "students")
    StudGroupDTO toDto(StudGroup student);
}
