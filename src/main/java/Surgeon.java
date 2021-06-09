import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("Surgeon")
@Scope("prototype")
public class Surgeon implements ISendClient{

    public void chooseDoctor() {
        System.out.println("Your surgeon awaits you in room number 102");
    }
}
