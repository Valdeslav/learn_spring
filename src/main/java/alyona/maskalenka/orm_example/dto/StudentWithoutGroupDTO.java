package alyona.maskalenka.orm_example.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class StudentWithoutGroupDTO extends BasicDTO {
    private String name;

    private int age;
}
