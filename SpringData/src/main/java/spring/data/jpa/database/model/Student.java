package spring.data.jpa.database.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created on 3/28/2018
 *
 * @author Pankaj Nimgade
 */

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer _Id;

    @Column(name = "student_name")
    private String name;

    @Column(name = "student_fullTime")
    private boolean isFullTime;

    @Column(name = "student_age")
    private Integer age;

    @Embedded
    private Person attendee;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "Enrollment", joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")})
    private List<Course> courses;

    public Student() {
    }

    public Student(Person attendee, String name, boolean isFullTime, Integer age) {
        this.attendee = attendee;
        this.name = name;
        this.isFullTime = isFullTime;
        this.age = age;
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

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
