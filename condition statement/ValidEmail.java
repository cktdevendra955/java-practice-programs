// Check if a string is a valid email address

class ValidEmail{
	public static void main(String args[]){
	
		String email = "abcg@amil.com";
		
		if((email.indexOf("@")) != -1){
			if((email.indexOf(".")) != -1){
				System.out.println("Valid email address ");
			}else{
				System.out.println("You Are Missing (.)");
			}
		}else{
			System.out.println("You Are Missing (@)");
		}
		
		
		
	}
}
