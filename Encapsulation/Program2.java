package Encapsulation;

import java.util.Scanner;

/*
 * Write a program to do the following.

Create two private variables with int and boolean and name the variables as age and decision respectively.
Create getter and setter methods as public and make necessary changes for setter methods to update the variable value.
Input or set age to age variable.
Using “If..else..” conditional statement, find if age is less than 60.
If the condition is satisfied, print “The age of the candidate is 70. Driving license can be issued to the candidate. false”.
 */
public class Program2 {
    private int age;
    private boolean decision;

    public int getAge() {
        return age;
    }

    public boolean getDecision() {
        return decision;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    public static void main(String args[]) {
        Program2 program2 = new Program2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        program2.setAge(age);
        ;
        if (program2.getAge() <= 60) {
            program2.setDecision(true);
        } else {
            program2.setDecision(false);
        }
        System.out.println("The age of the candidate is " + program2.getAge());
        System.out.println("Driving license can be issuedto the candidate. " + program2.getDecision());
    }

}
