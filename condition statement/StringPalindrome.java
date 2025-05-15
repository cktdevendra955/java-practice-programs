// Check if a string is palindrome or not.

class StringPalindrome{
	public static void main(String args[]){
		String  str = "OYO";
		int len = str.length()-1;
		String rev = "";
		
		int i =len;
		while(i >= 0){
			rev = rev + str.charAt(i);			
			i--;
		}		
		
		if(str.equals(rev)){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
	}
}
