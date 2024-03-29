package Proj1_Calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("**********Calculator*********");
        System.out.println("Enter two numbers (operands): ");
        System.out.println("Num1: ");
        int num1 = s.nextInt();
        System.out.println("Num2: ");
        int num2 = s.nextInt();
        System.out.print("Choose an Operation[+,-,*,/,%,]: ");
        char op = s.next().charAt(0);
        double res = 0.0;
        switch(op) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = (double) num1 / num2;
                break;
            case '%':
                res = num1 % num2;
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println(num1+" "+op+" "+num2+" : "+res);
        s.close();
    }
}
