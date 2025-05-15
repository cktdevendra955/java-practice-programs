//Check if a person is eligible to vote or not.

class PersonIsEligibleToVote{
	public static void main(String args[]){
	
		int age = 10;
		
		if(age > 18 && age < 150){
			System.out.println("Eligible");
		}else{
			System.out.println("Not Eligible");
		}
	}
}
