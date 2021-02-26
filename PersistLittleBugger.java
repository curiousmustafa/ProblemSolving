public class PersistLittleBugger{
/*
	Problem description :

	Given an integer n , return its multiplicative persistence , which is number of times you must multiply digits in n until you reach a single digit .
	For example : 54 => 5*4 =20 => 2 * 0 => 0 , so it multiplicative persistence is 2
	And 5 => 5 , its already one digit , so its persistence is 0
*/

private static int getPersistence(int num){
	int count =0;
	while(num>9){
		//this outer while loop will run until num has only one digit
		int temp = 1;
		while (num>0){
			//get number's digits muliplication
			temp *= num % 10;
			num=num /10;
		}
		//updating num value and increase count
		num = temp;
		count++;
	}
	return count;
}
public static void main(String ar[]){
	// Testing with 39 , 999 , 4
	System.out.println("Persistence of 39 is "+getPersistence(39));
	System.out.println("Persistence of 999 is "+getPersistence(999));
	System.out.println("Persistence of 4 is "+getPersistence(4));
}
}