public class HowManyPrimesFinder{
/*
	Problem description :

	Given a number , return the count of all primes numbers that came before that given number
	Example : 10 -> 2,3,5,7, => thats mean there are four primes numbers before 10
*/
private static int getPrimeNumbersCount(int num){
	int count = 0;
	for(int i=2;i<=num;i++){
		// Iterate through all numbers less than or equal to num
		boolean isPrime=true;
		for(int j=2;j<i;j++){
			if(i%j==0){
				isPrime=false;
			}
		}
		if(isPrime)
			count++;
	}
	return count;
}
public static void main(String ar[]){
	//Testing with 10 , 19 , 30
	System.out.println("Count of prime numbers before 10 is : "+getPrimeNumbersCount(10));
	System.out.println("Count of prime numbers before 19 is : "+getPrimeNumbersCount(19));
	System.out.println("Count of prime numbers before 30 is : "+getPrimeNumbersCount(30));
}
}