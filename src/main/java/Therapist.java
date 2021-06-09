import org.springframework.stereotype.Component;
@Component("Therapist")
public class Therapist implements ISendClient{

    public void chooseDoctor() {
        System.out.println("Your therapist awaits you in room number 101");
    }
}
