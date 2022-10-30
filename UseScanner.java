/**Create a basic Java program to implement Java I/O operations

1) Create variable of type int, float, double, boolean, char

2) Take input of all the variables 

3) display all the values on the console**/ 
import java.util.Scanner;

class UseScanner {

    public static void main(String a[]) {
        // declare variables and assign values

        int num1;
        float num2;
        char character;
        boolean bool;
        String str;
        double num3;
        // Creating object of Scanner class, to take input

        Scanner sc = new Scanner(System.in);

        System.out.println("enter int value ");
        num1 = sc.nextInt();

        System.out.println("enter float value ");
        num2 = sc.nextFloat();

        System.out.println("enter string value ");
        str = sc.next();
        System.out.println("enter double value ");
        num3 = sc.nextDouble();

        System.out.println("enter boolean value ");
        bool = sc.nextBoolean();

        System.out.println("enter character value ");
        character = sc.next().charAt(0);

        System.out.println("int -> " + num1);
        System.out.println("float -> " + num2);
        System.out.println("char -> " + character);
        System.out.println("boolean -> " + bool);
        System.out.println("String -> " + str);
        System.out.println("double -> " + num3);
    }
}