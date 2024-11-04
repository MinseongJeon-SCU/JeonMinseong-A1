public class HealthProfessional {
    private int id;
    private String name;
    private String hospitalDepartment;

    public HealthProfessional () {

    }

    public HealthProfessional (int id, String name, String hospitalDepartment) {
        this.id = id;
        this.name = name;
        this.hospitalDepartment = hospitalDepartment;
    }

    public void printAllInstanceVariables () {
        System.out.println("ID- " + id);
        System.out.println("Name- " + name);
        System.out.println("Department- " + hospitalDepartment);
    }

}

