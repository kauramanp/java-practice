import java.util.Scanner;

/*Write a program in java to implement a basic calculator using switch case statement
Accept two no as user input and print the result based on operation.
Display list of options 
        1 → addition
        2 → subtraction
        3 → multiplication
        4 → division
Perform division only if the second number is not equal to 0. If the second number is 0 print “Cannot be divided” on console. */
public class UseSwitch {
    public static void main(String q[]) {
        int firstNumber, secondNumber, operation;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        firstNumber = sc.nextInt();
        System.out.println("Enter the second number");
        secondNumber = sc.nextInt();
        System.out.println("Select the operation\n1 -> addition\n2 -> subtraction\n3 -> multiplication\n4 -> division ");
        operation = sc.nextInt();
        switch(operation){
            case 1: {
                System.out.println("Addition of two numbers is "+(firstNumber+secondNumber));
            }break;
            case 2: {
                System.out.println("Difference of two numbers is "+(firstNumber-secondNumber));

            }break;
            case 3: {
                System.out.println("Multiplication of two numbers is "+(firstNumber*secondNumber));

            }break;
            case 4: {
                if(secondNumber==0){
                    System.out.println("Sorry cannot divide any number with 0");
                }else{
                    System.out.println("Division of two numbers is "+(firstNumber/secondNumber));

                }
            }break;
            default: {
                System.out.println("Sorry the entered operation is incorrect");
            }
        }
    }
    
}
