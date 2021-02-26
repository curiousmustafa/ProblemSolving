public class BoxVolumes{
/*
	Problem description:

	Given an array of boxes , each box represent an array with 3 elements [length,width,height] , return sum of boxes's volumes
	A volume for one box is lenght*width*height
*/

private static int getBoxesVolume(int[][] boxes){
	/* A method that get array of boxes and return its volumes sum */
	int sum = 0;
	for(int i = 0; i<boxes.length;i++){
		//iterating through all boxes
		int volume=1;
		for(int j=0;j<boxes[i].length;j++){
			//iterating through all elements of a box
			volume =volume * boxes[i][j];
		}
		sum +=volume;
	}
	return sum;
}
public static void main(String ar[]){
	// Test with boxes [[4,2,4],[3,3,3],[1,1,2],[2,1,1]] , [[2,2,2],[2,1,1]]
	int [][] boxes1={{4,2,4},{3,3,3},{1,1,2},{2,1,1}};
	int [][] boxes2={{2,2,2},{2,1,1}};
	System.out.println("Volume for all boxes [[4,2,4],[3,3,3],[1,1,2],[2,1,1]] is : " + getBoxesVolume(boxes1));
	System.out.println("Volume for all boxes [[2,2,2],[2,1,1]] is : " + getBoxesVolume(boxes2));
}
}