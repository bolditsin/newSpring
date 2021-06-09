import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("clinic")
@Scope("prototype")
public class Clinic implements IClinic{

    @Autowired
    @Qualifier("Therapist")
    private ISendClient sendClientToTherapist;
    @Autowired
    @Qualifier("Surgeon")
    private ISendClient sendClientToSurgeon;
    @Autowired
    @Qualifier("Neurologist")
    private ISendClient sendClientToNeurologist;


    public void acceptClient(DoctorType type) {
        System.out.println("Hello!");
        if (type == DoctorType.Therapist) {
            sendClientToTherapist.chooseDoctor();
        } else if (type == DoctorType.Surgeon) {
            sendClientToSurgeon.chooseDoctor();
        } else {
            sendClientToNeurologist.chooseDoctor();
        }
    }


}
