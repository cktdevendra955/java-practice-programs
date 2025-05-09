/*
  * Chaining Constructors
  * Write a Java program to create a class called ChainingConstructors 
  * with instance variables studentId, studentName, and grade. 
  * Implement a default constructor and a parameterized constructor 
  * that takes all three instance variables. 
  * Use constructor chaining to initialize the variables. 
  * Print the values of the variables.
*/

class ChainingConstructors{
  int studentId;
  String studentName, grade;  
  ChainingConstructors(){
    this(11,"Dev","A++");
    System.out.println("*****************************************");
    System.out.println("* Student ID = "+studentId+"\t\t\t*");
    System.out.println("* Student Name = "+studentName+"\t\t\t*");
    System.out.println("* Student Grade = "+grade+"\t\t\t*");         
    System.out.println("*****************************************");
  }  
  ChainingConstructors(int Id, String name,String grade){
    this.studentId = Id;
    this.studentName = name;
    this.grade = grade;
  }  
  public static void main(String args[]){
      ChainingConstructors st = new ChainingConstructors();
  }

}

