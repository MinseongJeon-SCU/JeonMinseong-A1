//Use extends to inherit from the parent class which is a HealthProfessional
public class GeneralPractitioner extends HealthProfessional {
        private String gpType;
    
        //Default Constructor
        public GeneralPractitioner () {
            super();
        }
    
        //Second constructor that initialises all the instance variables
        public GeneralPractitioner (int id, String name, String hospitalLocation, String gpType) {
            super(id,name,hospitalLocation); //Use super to call the parent class's constructor
            this.gpType = gpType;
        }
        
        //Use @Override to override the parent class's method
        @Override
        public void printAllInstanceVariables() {
            super.printAllInstanceVariables();
            System.out.println("GP type - " + gpType);
        }
}
