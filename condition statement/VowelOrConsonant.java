// Check if a character is vowel or consonant.

import java.util.*;
class VowelOrConsonant{

	public static void main(String args[]){

		char c = 'A';					
		String vowel = "aeiouAEIOU";		
		String s = String.valueOf(c);			
		
		if(vowel.contains(s)){
			System.out.println("vowel");
		}else{
			System.out.println("consonant");
		}
		
		
	}
}

