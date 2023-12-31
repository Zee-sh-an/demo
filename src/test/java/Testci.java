import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import st.person;

public class Testci {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("con1.xml");
        person p=(person) context.getBean("pe");
        System.out.println(p);

    }
}
