public class Appointment {
    private String patientName;
    private int patientMobileNumber;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    //Default Constructor
    public Appointment() {

    }

    public Appointment(String patientName, int patientMobileNumber, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobileNumber = patientMobileNumber;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    public void printAllInstanceVariables () {
        System.out.println("Patient Name - " + patientName);
        System.out.println("Patient Mobile Number - " + patientMobileNumber);
        System.out.println("Preferred Time Slot - " + preferredTimeSlot);
        System.out.println("Selected Doctor - " + selectedDoctor);
    }

}
