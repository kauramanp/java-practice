package Polymorphism;
/*
 * Write an program to create a class Polymorphism with two methods of same name findArea 
 * and with number of parameters as 2 and 3 respectively 
 * and find the area of the rectangle and rectangular cuboid respectively.
 */
public class Polymorphism{
    void findArea(int a, int b){
        System.out.println("Area of rectangle is "+a*b+" cm square");
    }
    void findArea(int l, int w, int h){
        System.out.println("Area of rectangle is "+(2*l*w+2*l*h+2*h*w)+" cm cube");

    }
    public static void main(String args[]) {
        Polymorphism polymorphism = new Polymorphism();
        polymorphism.findArea(7, 9);
        polymorphism.findArea(7, 9, 5);
    }

}