public class NumberReverser{
/*
	Problem description:

	Write a function that take an integer and inverse it
	For example , 25234 became 43252
*/

private static int reverseNumber(int num){
	/*
		if num is negative number , we save an indicator that its negative
	*/
	boolean isNegative = false;
	int flag = 1; //flag that we use to handle negative/positive number , positive if the num is positive , negative otherwise
	int reversedNum = 0;
	int factor = 10; //help us dividing parts of the number
	if(num<0){
		//if its negative , save the indicator , and the flag = -1 , and muliply it by flag to convert it to a positive
		isNegative = true;
		flag = -1;
		num = num * flag;
	}
	while(num>0){
		//we keep cutting until the num is zero
		int reminder = num % factor ; //getting the most right digit
		reversedNum=reversedNum * factor + reminder ; //building our reversedNum , move right and add the reminder
		num = num/10;
	}

	return reversedNum * flag;
}

public static void main(String ar[]){
	//test with integers 44263 , 29024 , -14382 , 25830
	System.out.println("The reverse of number 44263 is : " + reverseNumber(44263));
	System.out.println("The reverse of number 29024 is : " + reverseNumber(29024));
	System.out.println("The reverse of number -14382 is : " + reverseNumber(-14382));
	System.out.println("The reverse of number 25830 is : " + reverseNumber(25830));

}
}