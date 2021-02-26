public class LongestWordFinder{
/*
	Problem description :

	Given a sentence , return the longest word in that sentence .
	Note :Only words contains a comma or period like in (Father's or re-connect) count as one word
	For example "Father's message**s" , here longest word is Father's which has 8 characters !
*/
private static String getLongestWord(String sentence){
	String currentWord="",longestWord="";

	for(int i=0;i<sentence.length();i++){
		char currentChar=sentence.charAt(i);
		if(currentChar >=65 && currentChar <91 || currentChar >=97 && currentChar <123 || currentChar == 45 ||currentChar==39){
			//if the character is in range A-Z or a-z or its - or ' , add it to current word
			currentWord +=currentChar;
		}
		else{
			/*
				if itsn't in that range or that characters , this mean we reach the end of current word
				we re-assign our saved longest word by curren word  if the current is longer
			*/
			if(currentWord.length()>longestWord.length()){
				longestWord=currentWord;
			}
			currentWord="";
		}
	}
	return longestWord;

}

public static void main(String ar[]){
	/*
		Testing with sentences:
		"This sentence is used to test our function's result!!!!"
		"I think that it's necessary to do some problem solving activities ."
	*/
	System.out.println("The longest word in : \"This sentence is used to test our function's result!!!!\" is the word :"
					+getLongestWord("This sentence is used to test our function's result!!!!"));

	System.out.println("The longest word in : \"I think that it's necessary to do some problem solving activities .\" is the word :"
						+getLongestWord("I think that it's necessary to do some problem solving activities ."));

}
}