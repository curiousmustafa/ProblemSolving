public class RecursiveStringReverser{
/*
	Problem descripition:

	Given a string , reverse it using recursion
*/
private static String getReversedString(String word){
	if(word.length()==0){
		return "";
	}
	//we take the last char and re-run function with the rest string
	String lastChar=word.substring(word.length()-1);
	String remainString = word.substring(0,word.length()-1);
	return lastChar.concat(getReversedString(remainString));
}
public static void main(String ar[]){
	// Testing with "Hello"  , "Genius" , "Programmer"
	System.out.println("Reverse of string Hello is " + getReversedString("Hello"));
	System.out.println("Reverse of string Genius is " + getReversedString("Genius"));
	System.out.println("Reverse of string Programmer is " + getReversedString("Programmer"));
}
}