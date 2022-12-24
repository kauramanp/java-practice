package CodingChallenge1;

public class AccountDetails extends CurrentAccount {

    int depositAmount, withdrawalAmount;
    AccountDetails(String a, int b, int c, int d, int e) {
        super(a, b, c);
        this.depositAmount = d;
        this.withdrawalAmount = e;
    }

    void Display(){
        super.Display();
        System.out.print(" Deposit Amount "+depositAmount+" withdraw amount "+withdrawalAmount);
    }
    
}
