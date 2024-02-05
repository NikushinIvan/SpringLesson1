package application.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import school.enums.Grade;
import school.enums.Subject;
import school.student.Student;

import java.util.Map;

@Component
public class JilHelperPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student) {
            Student student = (Student) bean;
            if ("Jil".equals(student.getName())) {
                for (Map.Entry<Subject, Grade> subjectGradeEntry : student.getGrades().entrySet()) {
                    if (subjectGradeEntry.getValue().getGradeValue() < 3) {
                        subjectGradeEntry.setValue(Grade.C);
                        System.out.println("Jil " + subjectGradeEntry.getKey() + " grade changed");
                    }
                }
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
