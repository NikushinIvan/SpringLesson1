package application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import school.enums.Grade;
import school.enums.Subject;
import school.student.Student;

import java.util.HashMap;
import java.util.Map;

import static school.enums.Grade.*;
import static school.enums.Subject.*;

@Configuration
@ComponentScan("school.teacher")
public class ContextConfig {

    @Bean
    public Student student1() {
        Map<Subject, Grade> grades = new HashMap<>();

        grades.put(INFORMATICS, A);
        grades.put(MATHEMATICS, B);
        grades.put(HISTORY, C);

        return new Student("Ivan", grades);
    }

    @Bean
    public Student student2() {
        Map<Subject, Grade> grades = new HashMap<>();

        grades.put(INFORMATICS, A);
        grades.put(MATHEMATICS, C);
        grades.put(HISTORY, B);

        return new Student("Kirill", grades);
    }

    @Bean
    public Student student3() {
        Map<Subject, Grade> grades = new HashMap<>();

        grades.put(INFORMATICS, C);
        grades.put(MATHEMATICS, C);
        grades.put(HISTORY, D);

        return new Student("Jil", grades);
    }
}
