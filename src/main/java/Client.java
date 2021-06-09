import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {
    public static DoctorType type = DoctorType.Surgeon;
    public static void main(String[]args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IClinic clinic1 = context.getBean("clinic", IClinic.class);
        clinic1.acceptClient(type);
    }
}
