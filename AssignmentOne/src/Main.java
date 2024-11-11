import java.util.ArrayList;
public class Main {
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

        //ArrayList
        ArrayList<Appointment> appointment = new ArrayList<>();

        //Two appointment with GP and two appointment with SP
        Appointment Appointment1 = new Appointment("Yoon", 1234, "7am", GP1);
        Appointment Appointment2 = new Appointment("Yeo", 4567,"9am", GP2);
        Appointment Appointment3 = new Appointment("Jeon", 1111, "10am", SP1);
        Appointment Appointment4 = new Appointment("Lee", 22222, "12pm" , SP2);

        appointment.add(Appointment1);
        appointment.add(Appointment2);
        appointment.add(Appointment3);
        appointment.add(Appointment4);
        

        //methods for print
        for (Appointment appointmentList : appointment){
            appointmentList.printAppointment();
        }

    }
        //Method for creating new booking
        public static void createAppointment(ArrayList<Appointment> appointment, String patientName, int patientMobileNumber, String preferredTimeSlot, HealthProfessional selectedDoctor ){
            Appointment newAppointment = new Appointment(patientName, patientMobileNumber, preferredTimeSlot, selectedDoctor);
            appointment.add(newAppointment);
        }

        //Method for displaying existing appointment
        public static void  printExistingAppointments(ArrayList<Appointment> appointment, String patientName, int patientMobileNumber, String preferredTimeSlot, HealthProfessional selectedDoctor ){
            if (appointment.isEmpty()){
                System.out.println("There is no appointment");
            }
            else {
                for (Appointment appointmentList : appointment){
                    appointmentList.printAppointment();
                }
            }
        }
}
