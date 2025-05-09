/*
    Constructor with Array Initialization
    Write a Java program to create a class called Classroom 
    with instance variables myClassName and students (an array of strings). 
    Implement a parameterized constructor that initializes these variables. 
    Print the values of the variables.
*/
public class ConstructorwithArrayInitialization {    
    static String [] myClassName = new String[5];    
    static String [] students = new String[5];    

    ConstructorwithArrayInitialization(String[] myClassList, String[] studentsList){
        for (int i = 0; i < myClassList.length; i++) {
            myClassName[i] =  myClassList[i];            
        }
        for (int i = 0; i < studentsList.length; i++) {
           students[i] = studentsList[i];
        }
    }
    void display(){
        System.out.println("*********** CLASS LIST ***********");
        for (int i = 0; i < myClassName.length; i++) {
            System.out.println(myClassName[i]);
        }
        System.out.println("*********** SUTDETS LIST ***********");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
    public static void main(String[] args) {     
        String[] myClassList = {"Class A","Class B","Class C","Class D","Class E"};    
        String[] studentList = {"RAM","SHAYAM","GEETA","SITA","PREM"};
        ConstructorwithArrayInitialization cn2 = new ConstructorwithArrayInitialization(myClassList,studentList);
        cn2.display();
    }
}