package ClassObject;

/*
 * Write a program to do the following
 * Create integer non-static variable var1 and a static variable var2 and assign value 10 to var1 & var2.
 * create two methods method1 and method2.
 * In method1, use increment operator to increment var1 and use print statement to print var1.
 * Similarly perform for method2 with var2.
 * Create three objects obj1, obj2, obj3.
 * Execute method1 with all the objects.
 * Similarly perform for method2.
 */
public class StaticFunction {
    int var1 = 10;
    static int var2 = 10;

    public void method1() {
        var1++;
        System.out.println("var1 = " + var1);
    }

    public void method2() {
        var2++;
        System.out.println("static var2 = " + var2);
    }

    public static void main(String args[]) {
        StaticFunction obj1, obj2, obj3;
        obj1 = new StaticFunction();
        obj2 = new StaticFunction();
        obj3 = new StaticFunction();
        System.out.println("Invoking methods for obj1");
        obj1.method1();
        obj1.method2();
        System.out.println("Invoking methods for obj2");
        obj2.method1();
        obj2.method2();
        System.out.println("Invoking methods for obj3");
        obj3.method1();
        obj3.method2();

    }
}
