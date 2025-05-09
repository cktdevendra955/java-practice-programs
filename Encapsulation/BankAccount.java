/*
    Write a Java program to create a class called BankAccount 
    with private instance variables accountNumber and balance. 
    Provide public getter and setter methods to access and modify these variables.
*/
 
public class BankAccount {
    private int accountNumber;
    private int balance;
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public static void main(String[] args) {
       BankAccount bAccount = new BankAccount();
       bAccount.setAccountNumber(123565);
       bAccount.setBalance(5000);
       System.out.println("ACCOUT NUMBER : "+bAccount.getAccountNumber());
       bAccount.getAccountNumber();
       System.out.println("BLANCE : "+bAccount.getBalance());
       
    }
}