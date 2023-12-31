import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class stereotype_test {
    public static void main(String[] args) {
//        ApplicationContext con=new AnnotationConfigApplicationContext(Student.class);
        ApplicationContext con = new ClassPathXmlApplicationContext("stereoconfig.xml");
        Student student=  con.getBean("ob",Student.class);
        System.out.println(student);
    }
}

