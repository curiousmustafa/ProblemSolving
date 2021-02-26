public class PerfectNumber{
	/*
		Problem description :

		A perfect number is a number that the sum of all its factors or divisors (Except the number itself) equal that number
		For example : 6 => 1,2,3 is its factors/divisors, and its sum equal = 6 , so 6 is a perfect number
	*/
    private static boolean isPerfectNumber(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num % i ==0){
                sum+=i;
            }
        }
        return sum==num;
    }
    public static void main(String[] args) {
        // Testing with numbers 6 , 12 , 34
        System.out.println("Number 6 is a perfect number (true/false) : "+isPerfectNumber(6));
        System.out.println("Number 12 is a perfect number (true/false) : "+isPerfectNumber(12));
        System.out.println("Number 28 is a perfect number (true/false) : "+isPerfectNumber(28));
        System.out.println("Number 34 is a perfect number (true/false) : "+isPerfectNumber(34));
    }

}
