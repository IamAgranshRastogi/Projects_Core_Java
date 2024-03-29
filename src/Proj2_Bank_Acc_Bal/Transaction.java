package Proj2_Bank_Acc_Bal;

import java.util.Scanner;
public class Transaction {
    public static void main(String[] args) {
        Bank_Acc  acc = new Bank_Acc();
        Scanner s = new Scanner(System.in);
        int choice;
        do{
            System.out.println("**********Bank Account Menu********");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Current Balance");
            System.out.println("4. Quit");
            System.out.println("Select an Option: ");
            choice = s.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Deposit Amount: ");
                    acc.deposit(s.nextInt());
                    break;
                case 2:
                    System.out.println("Current Balance: "+acc.getBalance());
                    System.out.print("Withdrawal Amount: ");
                    try{ acc.withdraw(s.nextInt());
                    } catch(InSufficientFundException e){
                        System.out.println(e.toString());
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: "+acc.getBalance());
                    break;
            }
            System.out.println();
        }while(choice != 4);
        System.out.println("!!!!! Thank You. Have a Nice Day!!!!!");
        s.close();
    }
}
