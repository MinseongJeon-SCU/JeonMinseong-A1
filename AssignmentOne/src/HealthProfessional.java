//Class
public class HealthProfessional {  
    private int id;
    private String name;
    private String hospitalLocation;

    //Default Constructor
    public HealthProfessional () {     

    }

    //Second Constructor that initialises all the instance variables
    public HealthProfessional (int id, String name, String hospitalLocation) {
        this.id = id;
        this.name = name;
        this.hospitalLocation = hospitalLocation;
    }

    // Method that prints all instance variables
    public void printAllInstanceVariables () {
        System.out.println("ID- " + id);
        System.out.println("Name- " + name);
        System.out.println("Location- " + hospitalLocation);
    }

    //Create Objects of GP and Specialist
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
    }
}

//Child Class
class GeneralPractitioner extends HealthProfessional {
    private String gpType;

    //Default Constructor
    public GeneralPractitioner () {
        super();
    }

    //Second constructor that initialises all the instance variables
    public GeneralPractitioner (int id, String name, String hospitalLocation, String gpType) {
        super(id,name,hospitalLocation);
        this.gpType = gpType;
    }

    @Override
    public void printAllInstanceVariables() {
        super.printAllInstanceVariables();
        System.out.println("GP type - " + gpType);
    }
}

//Child Class
class Specialist extends HealthProfessional {
    private String specialistType;

    //Default Constructor
    public Specialist () {
        super();
    }

    //Second constructor that initialises all the instance variables
    public Specialist (int id, String name, String hospitalLocation, String specialistType) {
        super(id,name,hospitalLocation);
        this.specialistType = specialistType;
    }

    @Override
    public void printAllInstanceVariables() {
        super.printAllInstanceVariables();
        System.out.println("Specialist type - " + specialistType);
    }
    
}



