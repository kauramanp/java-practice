package CodingChallenge1;

public class Account {
    String customerName;
    int accountNo;
    Account(String a, int b){
        this.customerName = a;
        this.accountNo = b;
    }

    void Display(){
        System.out.print("Customer name "+customerName+" account no "+accountNo);
    }
}
