public class ArrayItemsMultiplier{
/*
	Problem description:
	Given an int array , return a nested array with array of n arrays , where n is length of original array
	The n arrays are filled with item the item i in original array
	For example => [2,3,5] became [[2,2,2],[3,3,3],[5,5,5]]
*/
private static int[][] getMultipliedArray(int [] original){
	int size =original.length;
	int[][] result=new int[size][size];
	for(int i=0;i<size;i++){
		for(int j=0;j<size;j++){
			result[i][j]=original[i];
		}
	}
	return result;
}

private static void showResult(int[][] arr){
	int size =arr.length;

	for(int i=0;i<size;i++){
		String array=" [ ";
		for(int j=0;j<size;j++){
			array +=arr[i][j]+" ";
		}
		array +="] ";
		System.out.print(array);
	}
	System.out.println();
}
public static void main(String ar[]){
	//Testing with arrays [2,3,5] , [1,5,10,8,0]
	System.out.println("Result of multipling array [2,3,5] is : \n");
	showResult(getMultipliedArray(new int[]{2,3,5}));

	System.out.println("\nResult of multipling array [1,5,10,8,0] is : \n");
	showResult(getMultipliedArray(new int[]{1,5,10,8,0}));
}
}