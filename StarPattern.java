/*Write a program in java to print the following pattern (Hint : Use nested for loop)
*

**

***

****

***** */
public class StarPattern {
    public static void main(String g[]) {
        for(int i = 0; i<=5;i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
