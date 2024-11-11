import java.util.ArrayList;
public class Main {
     public static void main(String[] args) {
        GeneralPractitioner GP1 = new GeneralPractitioner (1, "Minseong", "Brisbane", "Mental Health");
        GeneralPractitioner GP2 = new GeneralPractitioner(2, "Jisung", "Gold Coast", "Vaccination");
        GeneralPractitioner GP3 = new GeneralPractitioner(3, "Chanho", "Bilinga", "Family Planning");

        Specialist SP1 = new Specialist (11, "Kim", "Coolangatta", "Cardiologist");
        Specialist SP2 = new Specialist (22, "Park", "Suerfers Paradise", "Dermatologist");

        //Print GP and Specialist
        GP1.printAllInstanceVariables();
        System.out.println("------------------------------");
        GP2.printAllInstanceVariables();
        System.out.println("------------------------------");
        GP3.printAllInstanceVariables();
        System.out.println("------------------------------");

        SP1.printAllInstanceVariables();
        System.out.println("------------------------------");
        SP2.printAllInstanceVariables();
        System.out.println("------------------------------");

        ArrayList <Appointment> appointment = new ArrayList<>();
    

    }
}
