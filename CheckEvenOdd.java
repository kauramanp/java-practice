import java.util.Scanner;

/*Write a program in java to check whether the given number is an even number or not using an if else statement. 
    If the number is even, it should print “Number is even”, otherwise it should print “Number is odd”.*/
public class CheckEvenOdd {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("Number is even ");
        }else{
            System.out.println("Number is odd ");
        }
    }
}
