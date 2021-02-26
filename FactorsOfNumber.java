import java.util.*;
public class FactorsOfNumber{
/*
	Problem description:

	Given an integer , return a list of all its factors
*/

private static List<Integer> getFactors(int number){
	List<Integer> factors =new ArrayList<>();
	for(int i=1;i<=number / 2 ;i++){
		//searching from 1 to maximum possible factor which is number/2
		if(number % i == 0){
			// i is a factor of that number
			factors.add(i);
		}
	}
	// By default , any number is a factor of itself , so we add that number to factor's list too
	factors.add(number);
	return factors;
}
public static void main(String ar[]){
	// Testing our function with the integers 4 , 12 , 17 , 54
	System.out.println("Factors of number 4 is :" + getFactors(4));
	System.out.println("Factors of number 12 is :" + getFactors(12));
	System.out.println("Factors of number 17 is :" + getFactors(17));
	System.out.println("Factors of number 54 is :" + getFactors(54));
}
}