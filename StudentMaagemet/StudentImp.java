public class StudentImp implements StudentServices{

    int sub[] = new int[5];    

    StudentImp(int sub1, int sub2, int sub3, int sub4,int sub5){
        sub[0] = sub1;
        sub[1] = sub2;
        sub[2] = sub3;
        sub[3] = sub4;
        sub[4] = sub5;
    }

    @Override
    public int sumOfNumbers()  {      
        int sumOfAll = 0;
        for (int i = 0; i < sub.length-1; i++) {
            sumOfAll = sumOfAll + sub[i];
        }
        return sumOfAll;      
    } 
    @Override
    public float average() {        
        int avr = sumOfNumbers() / sub.length;
        return avr;
    }
 
    
}
