package spring.data.jpa.database.model;

import javax.persistence.*;

/**
 * Created on 3/28/2018
 *
 * @author Pankaj Nimgade
 */

@Entity
@Table(name = "COURSE")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Integer _Id;

    @Column(name = "course_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "course_dept_id")
    private Department department;

    public Course() {
    }

    public Course(String name, Department department) {
        this.name = name;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Course{" +
                "_Id = " + _Id + ", name = " + name + ", department= " + department.getName() + "}";
    }
}