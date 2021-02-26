import java.util.*;
public class GCDFor2Number{
/*
	Problem descripition :

	Given 2 numbers , return the greatest common divider between them
*/

private static int getGCD(int x,int y){
	//in worst case , gcd can be the smallest number between the 2 numbers
	int smallest = Math.min(x,y);
	int greatest = Math.max(x,y);
	//by default , 1 is gcd between any 2 numbers
	int gcd = 1;
	for(int i=1;i<=smallest;i++){
		if(smallest % i == 0 && greatest % i==0){
			gcd=i;
		}
	}
	return gcd;
}
public static void main(String ar[]){
	//Testing with (3,5)  , (14,28)  , (4,18)  , (27,108)
	System.out.println("The GCD between 3 & 5 is : " + getGCD(3,5));
	System.out.println("The GCD between 14 & 28 is : " + getGCD(14,28));
	System.out.println("The GCD between 4 & 18 is : " + getGCD(4,18));
	System.out.println("The GCD between 27 & 108 is : " + getGCD(27,108));
}
}