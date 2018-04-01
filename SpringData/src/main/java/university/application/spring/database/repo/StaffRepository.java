package university.application.spring.database.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import university.application.spring.database.domain.Staff;

/**
 * DataSource Management for the Staff at the University.
 * <p>
 * Created by maryellenbowman
 */
public interface StaffRepository extends PagingAndSortingRepository<Staff, Integer> {
}
