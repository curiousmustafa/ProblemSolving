public class ConsecutiveArrays{
/*
	Problem description:

	Given an array of integers , return true if the array is consecutive .
	Array is consecutive if all numbers appear at most once and can be re-arranged in consecutive arrangement
	For example : array [3,2,5,1,4] is consecutive ,all numbers appears once ,and can be arranged in [1,2,3,4,5]
	which is consecutive numbers
*/

private static boolean isArrayConsecutive(int[] array){
	boolean consecutive=true;
	//first we arrange our array asc , using selection sort
	for(int i=0;i<array.length-1;i++){
		int min=i;
		for(int j=i+1;j<array.length;j++){
			if(array[j]<array[min]){
				//update min index
				min=j;
			}
		}
		//swap current index value with min value
		int temp = array[min];
		array[min]=array[i];
		array[i]=temp;
	}
	//after sorting our array , check if its consecutive
	for(int i=0;i<array.length-1;i++){
		if(array[i]+1!=array[i+1]){
			consecutive=false;
		}
	}
	return consecutive;
}
public static void main(String ar[]){
	//Testing using [3,2,5,4] , [4,2,6,5,3,1,4] , [8,4,6]
	System.out.println("Is array [3,2,5,4] consecutive ? " +isArrayConsecutive(new int[]{3,2,5,4}));
	System.out.println("Is array [4,2,6,5,3,1,4] consecutive ? " +isArrayConsecutive(new int[]{4,2,6,5,3,1,4}));
	System.out.println("Is array [8,4,6] consecutive ? " +isArrayConsecutive(new int[]{8,4,6}));
}
}