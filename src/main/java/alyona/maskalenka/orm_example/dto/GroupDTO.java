package alyona.maskalenka.orm_example.dto;

import alyona.maskalenka.orm_example.entity.Student;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class GroupDTO extends BasicDTO {
    int number;

    List<Student> students;
}
