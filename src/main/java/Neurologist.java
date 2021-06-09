import org.springframework.stereotype.Component;
@Component("Neurologist")
public class Neurologist implements ISendClient{

    public void chooseDoctor() {
    System.out.println("Your therapist awaits you in room number 103");
}
}
