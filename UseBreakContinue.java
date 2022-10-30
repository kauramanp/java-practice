/*Program to implement the continue and break functionality

Create a program to print the table of 2. 
Create an infinite for loop, use continue if no doesn't come in table of 2, 
and break if the loop variable exceeds 20. */
public class UseBreakContinue {
    public static void main(String g[]){
        int i = 1;
        for(;;i++){
            if(i%2 != 0){
                continue;
            }else if(i > 20){
                break;
            }else if(i%2 == 0 ){
                System.out.println("2 X "+i+" = "+(2*i));
            }
        }
    }
}
