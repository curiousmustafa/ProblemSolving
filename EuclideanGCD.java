public class EuclideanGCD{
	/*
		Euclidean is an algorithm for finding the Greatest Common Divider between two numbers
		numbers are always positive
		getGcd(int a,int b) is a recursive method that search for the GCD until it find it or return the default which is 1
	*/
	private static int getGcd(int a , int b){
		if(a<b){
			//we swap numbers if the first is smaller then the second !
			int temp=a;
			a=b;
			b=temp;
		}
		int reminder=a%b; //get reminder of the divison
		if(reminder==0){
			//we know that we found our GCD when the reminder is zero
			return b;
		}
		else{
			//recursion start , with b as first number , and reminder as second number
			return getGcd(b,reminder);
		}
	}

	public static void main(String arg[]){
		//We test our function with (6,8) , (25,5) , (49,14)
		System.out.println("GCD Between 6,8 is : "+getGcd(6,8));
		System.out.println("GCD Between 25,5 is : "+getGcd(25,5));
		System.out.println("GCD Between 49,14 is : "+getGcd(49,14));
	}
}