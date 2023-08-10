package alyona.maskalenka.orm_example.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class BasicDTO implements Serializable {

    protected Long id;

}
