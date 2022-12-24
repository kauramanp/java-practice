package Methods;

/*
 * Write a program to do the following
 * Create two methods with the same name, one with argument and the other without argument.
 * Create two methods of the same name with string as return type, where one method with string as argument and the other without argument.
 * In a method with no input as argument and return type, the method should print “I am from method without return type”.
 * In a method without return type and input as an argument, the method should print “I am from method without return type and an input argument”.
 * Similarly, print for both methods with return type.
 * Execute all the objects one after another, note what type of method is used in the program and print the type of method used at the end of the output.
 */
public class Methods1 {
    void SameName(int a) {
        System.out.println("Same name method with argument");
    }

    void SameName() {
        System.out.println("Same name method without argument");
    }

    String SameNameReturn(String args) {
        return args;
    }

    String SameNameReturn() {
        return "In same name method with String return type and no arguments";
    }

    public static void main(String args[]) {
        Methods1 methods1 = new Methods1();
        methods1.SameName(2);
        methods1.SameName();
        System.out.println(methods1.SameNameReturn("In same name method with String return type and string argument"));
        System.out.println(methods1.SameNameReturn());
    }

}
