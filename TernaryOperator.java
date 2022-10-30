import java.util.Scanner;

class TernaryOperator{
    public static void main(String s[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is even or odd");
        int number = scanner.nextInt();
        String result = (number%2 == 0)?"Even":"Odd";
        System.out.println("Number is "+result);

        
    }
}