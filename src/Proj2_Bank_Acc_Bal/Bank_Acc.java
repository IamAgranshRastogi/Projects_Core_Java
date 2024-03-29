package Proj2_Bank_Acc_Bal;

public class Bank_Acc {
    private double balance;

//    Constructor
    public Bank_Acc(){
        balance = 0.0;
    }

//    For Deposit Method
    public void deposit(double amount){
        balance = balance + amount;
    }

//    For Withdrawal Method
    public void withdraw(double amount) throws InSufficientFundException{
        if(amount>balance){
            throw new InSufficientFundException("Insufficient Balance. Withdrawal process can't be processed.");
        }
        balance = balance - amount;
    }

//    Getter for balance
    public double getBalance() {
        return balance;
    }
}
