// Check if a number is between 1 and 100.

class NumberIsBetween{
	public static void main(String args[]){
	
		int num = -10000;
		
		if(num < 0){
			System.out.println("Number Less Than 0 ");
		}else if(num > 0 && num <= 100){
			System.out.println("Number between 1 and 100.");
		}else{
			System.out.println("Greater Than 100.");
		}
	}
}
