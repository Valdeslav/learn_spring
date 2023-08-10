package alyona.maskalenka.orm_example.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="group")
@Getter
@Setter
public class Group extends BasicEntity {
    int number;

    @OneToMany(mappedBy = "group")
    private List<Student> students = new ArrayList<>();
}
