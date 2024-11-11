import java.util.ArrayList;
public class Main {
    //ArrayList
    static ArrayList<Appointment> appointment = new ArrayList<>();
    public static void createAppointment(String patientName, int patientMobileNumber, String preferredTimeSlot, HealthProfessional selectedDoctor ){
        Appointment newAppointment = new Appointment(patientName, patientMobileNumber, preferredTimeSlot, selectedDoctor);
        appointment.add(newAppointment);
    }
    
    //Method for displaying existing appointment
    public static void printExistingAppointments() {
        if (appointment.isEmpty()){
            System.out.println("There is no appointment");
        }
        else {
            for (Appointment appointmentList : appointment){
                appointmentList.printAppointment();
                System.out.println("------------------------------");
            }
        }
    }

    //Method for cancel Booking
    public static void cancelBooking(int patientMobile) {
        boolean find = false;  
        for (Appointment appointments : appointment) {
            if (appointments.getMobileNumber() == patientMobile) {
                appointment.remove(appointments);
                System.out.println("Booking has been canceled " + patientMobile);
                find = true;  
                break; 
            }
        }
        if (!find) {
            System.out.println("Cannot find patient mobile Number " + patientMobile);
        }
    }

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
        

        //Make Appointments
        createAppointment("Ishan", 1111, "10am", GP1);
        createAppointment("Minseong" ,2222, "11am",GP2);
        createAppointment("Jeehwan", 3333, "12pm", SP1);
        createAppointment("Minyeong", 4444, "1pm", SP2);
        
        //Print Existing Appointments
        printExistingAppointments();
        
        //Cancel Booking
        cancelBooking(4444);
        cancelBooking(55554);
        System.out.println("------------------------------");

        //Print updated booking
        printExistingAppointments();
    }    
}
