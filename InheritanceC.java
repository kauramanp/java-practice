/**
 * Write a program to create classes InheritanceA, InheritanceB and InheritanceC 
 * to find the area of circleArea, rectangleArea and triangleArea respectively. 
 * Use multi level inheritance and execute all methods using the object of class InheritanceC.
*/

class InheritanceA{
    final float pi = 3.14f;
    public void circleArea(int r){
        System.out.println("Area of circle is "+(pi*r*r)+" cm");
    }
}

class InheritanceB extends InheritanceA{
    public void rectangleArea(int l, int b){
        System.out.println("Area of rectangle is "+(l*b)+" cm square");
    }
}

public class InheritanceC extends InheritanceB{
    public void triangleArea(int b, int h){
        System.out.println("Area of triangle is "+(0.5f * b * h)+"cm square");
    }
    public static void main(String args[]) {
        InheritanceC inheritanceC = new InheritanceC();
        inheritanceC.circleArea(2);
        inheritanceC.rectangleArea(20, 10);
        inheritanceC.triangleArea(3, 6);
    }

}
