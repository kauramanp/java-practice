package ClassObject;

/*
 * Create two separate classes Health & HealthDriver inside  package 
 * Declare variables age(int), weight(float) & bmi(float) inside class Health as protected.
 * Display all the variable in class HealthDriver
 */
class Health {
    protected int age;
    protected float weight;
    protected float height;
}

public class HealthDriver {
    public static void main(String a[]) {
        Health health = new Health();
        System.out.println("Age is: " + health.age + " years");
        System.out.println("Height is: " + health.height + "cm");
        System.out.println("Weight is: " + health.weight + "kg");

    }
}
