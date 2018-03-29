package spring.data.jpa.database.repository;

import org.springframework.data.repository.CrudRepository;
import spring.data.jpa.database.model.Student;

/**
 * Created on 3/28/2018
 *
 * @author Pankaj Nimgade
 */
public interface StudentRepository extends CrudRepository<Student, Integer>{
}
