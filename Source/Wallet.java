package Source;


import External.BankAPI;
import External.WalletAPI;

public class Wallet {
    private final String phoneNo;
    private double balance;

    public Wallet(String phone, double balance){
        this.phoneNo = phone;
        this.balance = balance;
    }

    public void withdraw(double amount){
        balance-=amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public double checkBalance(){
        return balance;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    public void setBalance(double b){
        balance = b;
    }
}
