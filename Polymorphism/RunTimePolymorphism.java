package Polymorphism;

class A{
    public void Car(){
        System.out.println(" I am method A ");
    }
    }
    
class B extends A{
    public void Car(){
        System.out.println(" I am method B ");
    }    
}

public class RunTimePolymorphism{ // main class
    public static void main(String[] args) { // main method
        A obj = new A();
        A obj1 = new B();
        obj.Car();
        obj1.Car();
    }
}

