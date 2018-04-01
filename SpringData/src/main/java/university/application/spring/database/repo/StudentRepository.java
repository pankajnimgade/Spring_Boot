package university.application.spring.database.repo;

import org.springframework.data.repository.CrudRepository;
import university.application.spring.database.domain.Person;
import university.application.spring.database.domain.Student;

import java.util.List;

/**
 * DataSource Management for the Students at the University.
 * <p>
 * Created by maryellenbowman
 */
public interface StudentRepository extends CrudRepository<Student, Integer> {
    //Simple Query Methods
    List<Student> findByFullTime(boolean fullTime);

    List<Student> findByAge(Integer age);

    List<Student> findByAttendeeLastName(String last);



    //Query Methods with Clauses and Exrpessions
    Student findByAttendeeFirstNameAndAttendeeLastName(String firstName, String lastName);

    Student findByAttendee(Person person);

    List<Student> findByAgeGreaterThan(int minimumAge);

    List<Student> findByAgeLessThan(int maximumAge);

    List<Student> findByAttendeeLastNameIgnoreCase(String lastName);

    List<Student> findByAttendeeLastNameLike(String likeString);

    Student findFirstByOrderByAttendeeLastNameAsc();

    Student findTopByOrderByAgeDesc();

    List<Student> findTop3ByOrderByAgeDesc();
}
