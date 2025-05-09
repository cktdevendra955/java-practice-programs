class Shared1 {
    int x,y;
    synchronized int add(int a, int b){
        try{
            x = a;
            y = b;
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        return x+y;
    }

}

class Thread1 extends Thread {
    Shared1 s;
    public Thread1(Shared1 s, String str){
        super(str);
        this.s = s;
        start();
    }    

    @Override
    public void run() {
        System.out.println("THREAD 1, SUM OF 10 AND 20 : " + s.add(10, 20));
    }
}



class Thread2 extends Thread {
    Shared1 s;
    public Thread2(Shared1 s, String str){
        super(str);
        this.s = s;
        start();
    }    

    @Override
    public void run() {
        System.out.println("THREAD 1, SUM OF 20 AND 30 : " + s.add(20, 30));
    }
}


class Thread3 extends Thread {
    Shared1 s;
    public Thread3(Shared1 s, String str){
        super(str);
        this.s = s;
        start();
    }    

    @Override
    public void run() {
        System.out.println("THREAD 1, SUM OF 30 AND 40 : " + s.add(30, 40));
    }
}
public class SynhronizeShared1 {
    public static void main(String[] args) {
        Shared1 st = new Shared1();
        Thread1 t1 = new Thread1(st, "ONE");
        System.out.println("HELLO");
    }    
}
