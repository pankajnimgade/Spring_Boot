package spring.data.jpa.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.data.jpa.database.model.Department;

/**
 * Created on 3/28/2018
 *
 * @author Pankaj Nimgade
 */
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
