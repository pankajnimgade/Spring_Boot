package spring.data.jpa.database.repository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.data.jpa.database.model.Department;

/**
 * Created on 3/28/2018
 *
 * @author Pankaj Nimgade
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaRepositoryDemo {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void checkRepository() {
        departmentRepository.save(new Department("Humanities"));
        departmentRepository.flush();

        departmentRepository.saveAndFlush(new Department("Fine Arts"));

        departmentRepository.save(new Department("Social Science"));

        System.out.println("\n*************3 Departments*************");
        departmentRepository.findAll().forEach(System.out::println);

        departmentRepository.deleteInBatch(
                departmentRepository.findAll().subList(0, 1));

        System.out.println("\n*************1 Less Departments*************");
        departmentRepository.findAll().forEach(System.out::println);
        departmentRepository.deleteAllInBatch();
        System.out.println("\n*************Zero Departments*************");
        departmentRepository.findAll().forEach(System.out::println);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Before
    @After
    public void banner() {
        System.out.println("\n\n-------------------------------------------------" +
                "-------------------------------------\n");
    }
}