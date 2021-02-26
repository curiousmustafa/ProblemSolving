public class NextLetterEncryption{
/*
	Problem description:

	Given a string , return an encrypted string that each letter in original string encrypted to next letter
	For example the string "lion" become "mjpo"
*/

private static String getEncryptedString(String original){
	String encrypted = "";
	for(int i=0;i<original.length();i++){
		encrypted += (char)((original.charAt(i))+1);
	}
	return encrypted;
}
public static void main(String ar[]){
	//Testing with String "Lion" , "Hey" , "Stupid"
	System.out.println("The encryption of Hey is :"+getEncryptedString("HeZ"));
	System.out.println("The encryption of Stupid is :"+getEncryptedString("Stupid"));
	System.out.println("The encryption of Lion is :"+getEncryptedString("Lion"));

}
}