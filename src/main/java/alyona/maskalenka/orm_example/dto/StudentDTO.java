package alyona.maskalenka.orm_example.dto;

import alyona.maskalenka.orm_example.entity.Group;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class StudentDTO extends BasicDTO {

    private String name;

    private int age;

    private Group group;
}
