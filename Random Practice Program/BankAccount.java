public class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


    // SINGLE DEPOSIT
    public double deposit(double depositBalance){
        setBalance(getBalance()+depositBalance);
        return depositBalance;
    }

    // MULTIP:E DEPOSIT
    public void deposit(double depositBalance, double depositBalance2){
        setBalance(getBalance()+(depositBalance+depositBalance2));        
        System.out.println("Deposited : " + depositBalance+", "+depositBalance2);
    }

    // SINGLE WITHDRAL
    public double withdral(double withdralBalance){
        setBalance((getBalance() - withdralBalance));
        return withdralBalance;
    }

    // MULTIPLE WITHDRAL
    public void withdral(double withdralBalance, double withdralBalance2){
        setBalance(getBalance()-(withdralBalance + withdralBalance2));        
        System.out.println("Withdral : " + withdralBalance +", " +withdralBalance2);
    }

    public static void main(String[] args) {
        BankAccount bAccount = new BankAccount();        
        System.out.println("Initial Balance: " + bAccount.getBalance());
        System.out.println("Deposited: "+bAccount.deposit(100));
        System.out.println("Balance: "+bAccount.getBalance());
        System.out.println("Withdral: "+bAccount.withdral(70));
        System.out.println("Balance: "+bAccount.getBalance());
        bAccount.deposit(100, 50);
        System.out.println("Balance: "+bAccount.getBalance());
        bAccount.withdral(100, 50);
        System.out.println("Balance: "+bAccount.getBalance());
        
    }
}
