import java.util.Scanner;

/*Write a java program to check whether a year is a leap year or not.
A year is a leap year if the following conditions are satisfied
The year is multiple of 400.
The year is multiple of 4 and not multiple of 100 */

public class CheckNumberMultiple {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year ");
        int number = sc.nextInt();
        if(number % 400 == 0){
            System.out.println("Leap Year");
        }else if(number % 100 == 0){
            System.out.println("Not a leap year");
        }else if(number % 4 == 0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
