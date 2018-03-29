package spring.data.jpa.database.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 3/28/2018
 *
 * @author Pankaj Nimgade
 */

@Entity
@Table(name = "DEPARTMENT")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Integer _Id;

    @Column(name = "department_name")
    private String name;

    @OneToMany(mappedBy = "department",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private List<Course> courses = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    protected Department() {
    }

    public Integer get_Id() {
        return _Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Department{" + "_Id = " + _Id + ", name = " + name + ", courses = " + courses + "}";
    }
}