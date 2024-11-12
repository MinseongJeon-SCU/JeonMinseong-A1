public class Appointment {
    private String patientName;
    private int patientMobileNumber;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    //Default Constructor
    public Appointment() {
        
    }

    //Second constructor that initialises all the instance variables
    public Appointment(String patientName, int patientMobileNumber, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobileNumber = patientMobileNumber;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    //Method for printing
    public void printAppointment() {
        System.out.println("Patient Name - " + patientName);
        System.out.println("Patient Mobile Number - " + patientMobileNumber);
        System.out.println("Preferred Time Slot - " + preferredTimeSlot);
        System.out.println("Selected Doctor - " + selectedDoctor);
        selectedDoctor.printAllInstanceVariables();
    }

    //Method for returning the patient's mobile number, which can be used to cancel booking
     public int getMobileNumber(){
        return patientMobileNumber;
    }
}
