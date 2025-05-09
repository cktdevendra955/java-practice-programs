/*
    Write a Java program to create a class called Employee 
    with methods called work() and getSalary(). 
    Create a subclass called HRManager that overrides the 
    work() method and adds a new method called addEmployee().
*/
public class Employee {
    String name;
    double salary;
    String work = "SE";

    Employee(String name, double salary,String work){
        this.name = name;
        this.salary = salary;
        this.work = work;
    }
    
    public String getWork(){
        return this.work;
    }
    public int getSalary(){
        return this.salary; 
    }

}
 
class HRManager extends Employee{
       
    HRManager()
    @Override
    public int getSalary() {
        // TODO Auto-generated method stub
        return super.getSalary();
    }
    @Override
    public String getWork() {
        // TODO Auto-generated method stub
        return super.getWork();
    }
}