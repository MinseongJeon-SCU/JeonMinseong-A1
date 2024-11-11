public class GeneralPractitioner extends HealthProfessional {
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
