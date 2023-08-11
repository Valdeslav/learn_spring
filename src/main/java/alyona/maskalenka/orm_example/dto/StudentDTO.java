package alyona.maskalenka.orm_example.dto;

import alyona.maskalenka.orm_example.entity.StudGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class StudentDTO extends BasicDTO implements Serializable {

    private String name;

    private int age;

    private long groupId;
}
