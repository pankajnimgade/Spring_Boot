package spring.data.jpa.database.repository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.data.jpa.database.model.Person;
import spring.data.jpa.database.model.Student;

/**
 * Created on 3/28/2018
 *
 * @author Pankaj Nimgade
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CurdRepositoryDemo {

    @Autowired
    private StudentRepository studentRepository;

    @Before
    public void setUp() throws Exception {
        boolean fullTime = true;
        studentRepository.save(new Student(new Person("Jane", "Doe"), "Jane", fullTime, 20));
        studentRepository.save(new Student(new Person("John", "Doe"), "John", fullTime, 22));
        studentRepository.save(new Student(new Person("Mike", "Smith"), "Mike", fullTime, 18));
        studentRepository.save(new Student(new Person("Ally", "Kim"), "Mike", fullTime, 19));
    }

    @Test
    public void checkRepository() {
        studentRepository.findAll().forEach(System.out::println);
    }

    @After
    public void tearDown() throws Exception {
    }
}