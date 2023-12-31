import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    //    @Value("zee")
//    @Autowired
    private String studentName;
    //    @Value("delhi")
//    @Autowired
    private String city;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String student) {
        this.studentName = student;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
