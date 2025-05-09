class Bank {
    float amount;
    float instRate;
    int month;
    
    synchronized double instRateCalculate(float amount, float instRate, int month){
        this.amount = amount;
        this.instRate = instRate;
        this.month = month;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        return (amount * instRate * Math.pow(instRate, month)) / (Math.pow(instRate, month) -1);
    }
}


class  MyCustomT1 extends Thread {
    Bank bank;
    MyCustomT1(Bank bank, String name, float amount, float instrate, int month){            
        super(name);        
        this.bank = bank;
        this.bank.amount = amount;
        this.bank.instRate = instrate;
        this.bank.month = month;
        start();
    }
    
    @Override
    public void run() {
        System.out.println(getName() +" : "+bank.instRateCalculate(bank.amount,bank.instRate,bank.month));
    }
}


class  MyCustomT2 extends Thread {
    Bank bank;
    MyCustomT2(Bank bank, String name, float amount, float instrate, int month){            
        super(name);        
        this.bank = bank;
        this.bank.amount = amount;
        this.bank.instRate = instrate;
        this.bank.month = month;
        start();
    }
    
    @Override
    public void run() {
        System.out.println(getName() +" : "+bank.instRateCalculate(bank.amount,bank.instRate,bank.month));
    }
}
 

class  MyCustomT3 extends Thread {
    Bank bank;
    MyCustomT3(Bank bank, String name, float amount, float instrate, int month){            
        super(name);        
        this.bank = bank;
        this.bank.amount = amount;
        this.bank.instRate = instrate;
        this.bank.month = month;
        start();
    }
    
    @Override
    public void run() {
        System.out.println(getName()+" : "+bank.instRateCalculate(bank.amount,bank.instRate,bank.month));
    }
}
public class BankInstThread {
    public static void main(String[] args) {
        Bank bank = new Bank();
        MyCustomT1 mT1 = new MyCustomT1(bank, "ONE",1000,2,3);
        MyCustomT2 mT2 = new MyCustomT2(bank, "TWO",1000,3,4);
        MyCustomT3 mT3 = new MyCustomT3(bank, "THREE",1000,4,5);
 
    }
}
