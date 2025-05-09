/* Static Methods:
	Write a Java program to create a class called "MathUtility" 
	with a static method add that takes two integers and returns their sum. 
	Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".
*/

class MathUtility{
  public static int add(int x, int y){
    return (x + y);
  }
  
  public static void main(String args[]){
    System.out.println("SUN OF 10 + 20 = " + add(10,20));
    System.out.println("SUN OF 20 + 30 = " + add(20,30));
    System.out.println("SUN OF 30 + 40 = " + add(30,40));
    
  }
}
