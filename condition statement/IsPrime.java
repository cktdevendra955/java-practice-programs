//4. Check if a number is prime or not.


class  IsPrime{
	public static void main(String args[]){
	
		int num = 3;
		boolean status = false;
		if( num == 1 || num == 2){
			status = true;	
		}
		
		for(int i = 1; i <= num ; i++){
			System.out.println(status);
		}
		
	
	}
}
