
import java.util.Arrays;

public enum DoctorType {

    Therapist(1,"Therapist"),
    Surgeon(2, "Surgeon"),
    Neurologist(3,"Neurologist");

    private final int id;
    private final String name;

    DoctorType(int id, String name){
        this.id=id;
        this.name= name;

    }

    public static DoctorType getById(int id){
        return Arrays.stream(values())
                .filter(t->t.getId()==id)
                .findFirst()
                .orElse(null);
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
