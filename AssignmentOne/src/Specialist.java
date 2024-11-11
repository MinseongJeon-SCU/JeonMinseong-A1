public class Specialist extends HealthProfessional {
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
