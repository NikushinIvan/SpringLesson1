package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import school.student.Student;
import school.teacher.Teacher;

public class Item1Xml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");

        Student xmlStudent1 = context.getBean("student1", Student.class);
        Student xmlStudent2 = context.getBean("student2", Student.class);
        Student xmlStudent3 = context.getBean("student3", Student.class);

        Teacher teacher = context.getBean("teacher", Teacher.class);

        System.out.println(xmlStudent1);
        System.out.println(xmlStudent2);
        System.out.println(xmlStudent3);
        System.out.println(teacher);

    }
}
