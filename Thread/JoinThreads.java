class Thread1 extends Thread{

    Thread1(String s){
        super(s);       
    }

    @Override
    public void run() {
        
        for (int i = 1; i <=5 ; i++) {
            System.out.println(getName());            
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(getName()+"  DEADE  ");
            }
        }
    }
}


class Thread2 extends Thread{
    Thread2(String s){
        super(s);
    }
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            System.out.println(getName());
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(getName()+"  DEADE  ");
            }
        }
    }
}

class Thread3 extends Thread{
    Thread3(String s){
        super(s);
    }
    @Override
    public void run() {
        for (int i = 1; i <=15; i++) {
            System.out.println(getName());
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(getName()+"  DEADE  ");
            }
        }
    }
}

public class JoinThreads {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Thread 1 ");
        Thread1 t2 = new Thread1("Thread 2 ");
        Thread1 t3 = new Thread1("Thread 3 ");
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        for (int i = 1; i <=20; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                
            }
            System.out.println(Thread.currentThread().getName() +"    DEADE  ");
            
        }
    }
}