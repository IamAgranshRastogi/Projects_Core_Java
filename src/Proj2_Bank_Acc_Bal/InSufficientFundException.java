package Proj2_Bank_Acc_Bal;

public class InSufficientFundException extends Exception{
    private String msg;

//    Cosntructor
    public InSufficientFundException(String msg){
        this.msg = msg;
    }
//   Getter Method of msg
    public String getMsg() {
        return msg;
    }
}
