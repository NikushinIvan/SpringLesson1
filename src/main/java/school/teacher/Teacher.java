package school.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import school.student.Student;

import java.util.List;

@Component
public class Teacher {
    @Autowired
    private List<Student> students;

    @Override
    public String toString() {
        return "Teacher{" +
                "students=" + students +
                '}';
    }
}
