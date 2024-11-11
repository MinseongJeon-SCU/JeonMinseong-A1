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
    
}




