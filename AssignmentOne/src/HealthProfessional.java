//Class
public class HealthProfessional {  
    private int id;
    private String name;
    private String hospitalDepartment;

    //Default Constructor
    public HealthProfessional () {     

    }

    //Second Constructor that initialises all the instance variables
    public HealthProfessional (int id, String name, String hospitalDepartment) {
        this.id = id;
        this.name = name;
        this.hospitalDepartment = hospitalDepartment;
    }

    // Method that prints all instance variables
    public void printAllInstanceVariables () {
        System.out.println("ID- " + id);
        System.out.println("Name- " + name);
        System.out.println("Department- " + hospitalDepartment);
    }

}

//Child Class
class GeneralPractitioner extends HealthProfessional {
    private String gpType;

    //Default Constructor
    public GeneralPractitioner () {
        super();
    }
}

//Child Class
class Specialist extends HealthProfessional {
    private String specialistType;

    //Default Constructor
    public Specialist () {
        super();
    }

}

