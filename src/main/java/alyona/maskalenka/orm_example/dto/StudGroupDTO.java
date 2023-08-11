package alyona.maskalenka.orm_example.dto;

import alyona.maskalenka.orm_example.entity.Student;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class StudGroupDTO extends BasicDTO implements Serializable {
    private int number;

    private List<StudentDTO> students;
}
