package alyona.maskalenka.orm_example.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="student")
@Getter
@Setter
public class Student extends BasicEntity implements Serializable {
    @Column(name="name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;

    @ManyToOne
    @JoinColumn(name="group_id")
    private StudGroup studGroup;
}
