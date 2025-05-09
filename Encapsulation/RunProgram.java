class MyPerson {
    String name;
    int age;
    static String country = "IND";

    MyPerson(){
        System.out.println("This Is Default");
    }
    MyPerson(String name,int age){
        this.name = name;
        this.age = age;       
    }

    void show(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(country);
    }  
    
}
public class  RunProgram {
    public static void main(String[] args) {
        MyPerson person = new MyPerson("xyz", 20);    
        System.out.println();    
        person.show();        
    }    
}

