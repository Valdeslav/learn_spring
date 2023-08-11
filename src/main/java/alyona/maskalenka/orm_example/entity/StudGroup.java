package alyona.maskalenka.orm_example.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="stud_group")
@Getter
@Setter
public class StudGroup extends BasicEntity implements Serializable {
    int number;

    @OneToMany(mappedBy = "studGroup")
    private List<Student> students = new ArrayList<>();
}
