// Check if a number is divisible by 2, 3 or 5.

class NumberDivisible{
	public static void main(String args[]){
		
		int num = 19;
		if((num % 2 == 0) || (num % 3 ==0) || (num % 5 ==0)){
			System.out.println("Divisible by 2, 3 or 5");
		}else{
			System.out.println("NOT Divisible by 2, 3 or 5");
		}
	}
}
