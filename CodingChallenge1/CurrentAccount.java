package CodingChallenge1;

public class CurrentAccount extends Account{
    int currentBalance;

    CurrentAccount(String a, int b,int c) {
        super(a, b);
        this.currentBalance = c;
    }

    void Display(){
        super.Display();
        System.out.print(" Current Balance "+currentBalance);
    }

    
}
