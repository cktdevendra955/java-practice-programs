package arraylist;
import java.util.ArrayList;
public class ArrayListWithCustomCalss {
    public static void main(String[] args) {
        ArrayList<Emp> empList = new ArrayList<>();
        empList.add(new Emp(101,"RAM"));
        empList.add(new Emp(102,"shyam"));
        empList.add(new Emp(103,"raj"));        
        System.out.println("\n" + empList);   
        
        if (empList.contains(new Emp(101,"RAM"))) {
            System.out.println("Exist");
        }else{
            System.out.println("Not Exist");
        }
    }
}
class Emp {
    int id;
    String name;
    Emp(int id,String name){
        this.id = id;
        this.name = name;
    }     
    public String toString(){
        return id +" " + name;
    }
    
   
   
}
