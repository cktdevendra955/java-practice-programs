/*
    Write a Java program to create a class called Student 
    with private instance variables student_id, student_name, and grades. 
    Provide public getter and setter methods to access and modify 
    the student_id and student_name variables. 
    However, provide a method called addGrade() 
    that allows adding a grade to the grades variable while 
    performing additional validation
*/
public class Student {
    private int student_id;
    private String student_name;
    private String grades;
    
    public int getStudent_id() {return student_id; }

    public String getStudent_name() {return student_name; }

    public String getGrades() { return grades; }    

    public void setGrades(String grades) {this.grades = grades; }

    public void setStudent_id(int student_id) {this.student_id = student_id; }
    
    public void setStudent_name(String student_name) {this.student_name = student_name;}
    
    public static void main(String[] args) {     
        Student student = new Student();
        student.setStudent_id(10);
        student.setStudent_name("DEV");
        student.setGrades("A++");
        System.out.println();
        System.out.println("STUDENT ID : "+student.getStudent_id());
        System.out.println("STUDENT NAME : "+student.getStudent_name());
        System.out.println("STUDENT GRADE : "+student.getGrades());        
    }
}