public class ParagraphFinder{
/*
	Problem description :

	Given a word & large paragraph of multiple sentences , each sentence in paragraph end with a full stop , return the whole first sentence which contains that word.
	If no sentence found , return empty string
*/

private static String getSentence(String paragraph,String word){
	String sentence="";
	String currentSentence="";
	for(int i=0;i<paragraph.length();i++){
		if(paragraph.charAt(i)!='.'){
			currentSentence +=paragraph.charAt(i);
		}
		else{
			if(currentSentence.toLowerCase().indexOf(word.toLowerCase())>-1){
				sentence=currentSentence+".";
				break;
			}
			currentSentence="";
		}
	}
	return sentence;
}
public static void main(String ar[]){
	/*
		Testing with paragraph:
	*/
	String paragraph="I live on earth . its a small planet in solar system . There are about 7 billion human live on it too . There are four seasons . Its winter now .";
	String word="About";
	System.out.println("Word \"about\" appear in sentence : " + getSentence(paragraph,word));

}
}