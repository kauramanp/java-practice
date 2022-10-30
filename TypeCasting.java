import java.util.Scanner;

/*Create basic program to declare variables num1, num2 and result of type float.

Perform following operation

Addition, Subtraction, Division, Multiplication */

public class TypeCasting {
    public static void main(String q[]) {
        int firstNumber, secondNumber, operation;
        Float result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        firstNumber = sc.nextInt();
        System.out.println("Enter the second number");
        secondNumber = sc.nextInt();
        result = (float) (firstNumber + secondNumber);
        System.out.println("Addition of two numbers is "+result);

        result = (float) (firstNumber - secondNumber);
        System.out.println("Difference of two numbers is "+result);

        result = (float) (firstNumber * secondNumber);
        System.out.println("Multiplication of two numbers is "+result);

        if(secondNumber==0){
            System.out.println("Sorry cannot divide any number with 0");
        }else{
            result = (float) (firstNumber / secondNumber);
            System.out.println("Division of two numbers is "+result);

        }

       
    }
}
