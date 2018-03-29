package spring.data.jpa.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created on 3/28/2018
 *
 * @author Pankaj Nimgade
 */

@Entity
@Table(name = "ENROLLMENT")
public class Enrollment {

    @Column(name = "student_id")
    private Integer student_id;

    @Column(name = "course_id")
    private Integer course_id;

    public Enrollment(Integer student_id, Integer course_id) {
        this.student_id = student_id;
        this.course_id = course_id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }
}