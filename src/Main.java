import java.util.Scanner;
abstract class Patient {
    private final String name;
    private final int age;
    private final String gender;
    public Patient(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public abstract void displayDetails();
}
class Inpatient extends Patient {
    private final String roomNumber;
    private final String disease;
    public Inpatient(String name, int age, String gender, String roomNumber, String disease) {
        super(name, age, gender);
        this.roomNumber = roomNumber;
        this.disease = disease;
    }
    @Override
    public void displayDetails() {
        System.out.println("Inpatient: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Disease: " + disease);
    }
}
class Outpatient extends Patient {
    private final String appointmentDate;
    private final String doctorAssigned;
    public Outpatient(String name, int age, String gender, String appointmentDate, String doctorAssigned) {
        super(name, age, gender);
        this.appointmentDate = appointmentDate;
        this.doctorAssigned = doctorAssigned;
    }
    @Override
    public void displayDetails() {
        System.out.println("Outpatient: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Doctor Assigned: " + doctorAssigned);
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for the Inpatient:");
        System.out.print("Name: ");
        String inpatientName = scanner.nextLine();
        System.out.print("Age: ");
        int inpatientAge = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("Gender: ");
        String inpatientGender = scanner.nextLine();
        System.out.print("Room Number: ");
        String roomNumber = scanner.nextLine();
        System.out.print("Disease: ");
        String disease = scanner.nextLine();
        System.out.println("\nEnter details for the Outpatient:");
        System.out.print("Name: ");
        String outpatientName = scanner.nextLine();
        System.out.print("Age: ");
        int outpatientAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Gender: ");
        String outpatientGender = scanner.nextLine();
        System.out.print("Appointment Date: ");
        String appointmentDate = scanner.nextLine();
        System.out.print("Doctor Assigned: ");
        String doctorAssigned = scanner.nextLine();
        Patient inpatient = new Inpatient(inpatientName, inpatientAge, inpatientGender, roomNumber, disease);
        Patient outpatient = new Outpatient(outpatientName, outpatientAge, outpatientGender, appointmentDate, doctorAssigned);
        System.out.println("\nPatient Details:");
        inpatient.displayDetails();
        outpatient.displayDetails();
        scanner.close();
    }
}
