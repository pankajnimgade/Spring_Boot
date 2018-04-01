package university.application.spring.database.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import university.application.spring.database.domain.Department;

/**
 * DataSource Management for the Departments at the University.
 * <p>
 * Created by maryellenbowman
 */
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
