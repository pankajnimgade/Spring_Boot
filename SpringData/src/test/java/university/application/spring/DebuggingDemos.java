package university.application.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import university.application.spring.database.repo.CourseRepository;

/**
 * Created by maryellenbowman.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class DebuggingDemos {

    @Autowired
    private CourseRepository courseRepository;

    /**
     * Common Mistakes, Uncomment to debug
     * <p>
     * Courses persisted to H2 in-Memory database at startup.
     *
     * @see UniversityApplication
     */
    @Test
    public void runtimeErrors() {

//        Course course = courseRepository.findByDeptName("Sciences");
//
//        Course view = courseRepository.getCourseViewByName("English 101");

    }


}
