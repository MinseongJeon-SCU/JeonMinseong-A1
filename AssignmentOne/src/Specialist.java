//Use extends to inherit from the parent class
public class Specialist extends HealthProfessional {
    private String specialistType;

    //Default Constructor
    public Specialist () {
        super();
    }

    //Second constructor that initialises all the instance variables
    public Specialist (int id, String name, String hospitalLocation, String specialistType) {
        super(id,name,hospitalLocation); //Use super to call the parent class's constructor
        this.specialistType = specialistType;
    }

    //Use @Override to override the parent class's method
    @Override 
    public void printAllInstanceVariables() {
        super.printAllInstanceVariables();
        System.out.println("Specialist Details  - " + specialistType);
    }
}
