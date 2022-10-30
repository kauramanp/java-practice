import java.util.Scanner;

/*Write a program to interchange two numbers without using a third variable.

Hint: perform addition and subtraction and use the same variables to store result. */
public class InterchangeVariable {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number ");
        int firstNumber = sc.nextInt();
        
        System.out.println("enter the second number ");
        int secondNumber = sc.nextInt();

        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("Numbers after interchanging ");
        System.out.println("First number "+firstNumber);
        System.out.println("Second number "+secondNumber);
        
    }
}
