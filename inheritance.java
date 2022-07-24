import java.util.Scanner;

class Information{
    String name;
    Long phoneNumber;
    String address;
    int experience;

    public void getInformation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        name = scanner.nextLine();
        System.out.println("Enter address");
        address = scanner.nextLine();
        System.out.println("Enter phone number");
        phoneNumber = scanner.nextLong();
    }

    public double calculateSalary(double base){
        return base*30;
    }
}

class Doctor extends Information{
    float salary;
    String expertise;
    public void getInformation(){
        super.getInformation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter field of expertise");
        expertise = scanner.nextLine();
        System.out.println("Enter salary");
        salary = scanner.nextFloat();
    }

    public float getSalary(){
        return salary;
    }
}

class Nurse extends Information{
    float salary;
    String expertise;
    public void getInformation(){
        super.getInformation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter field of expertise");
        expertise = scanner.nextLine();
        System.out.println("Enter salary");
        salary = scanner.nextFloat();
    }

    public float getSalary(){
        return salary;
    }
}

public class inheritance {
    public static void main(String args[]){
        Doctor doctor = new Doctor();
        doctor.getInformation();
        System.out.println("Salary of doctor is "+doctor.calculateSalary(doctor.getSalary()));

        Nurse nurse = new Nurse();
        nurse.getInformation();
        System.out.println("Salary of nurse is "+doctor.calculateSalary(nurse.getSalary()));
    }
}
