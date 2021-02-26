public class EmptyCellsDilemma{
	/*
		EmptyCellDilemma is a problem where we need to find count of unfilled cells
		Problem assume that the big square contain a lot of small cells like chess board
		Numbers of cells in a square depend on "step" which equal half of square width
		For example if the step = 10 , then square width will = 2*step =20 cells
		Both right and left diagonal lines are filled cells , remain cells are empty
	*/
	private static int getEmptyCells(int step){
		//step equal half of square's width
		int width=2*step;
		//we can find the empty cells using a simple equation
		//num of all cells in the square - cells in two diagonals lines
		int emptyCellsNum=(int)Math.pow(width,2)-(2*width);
		return emptyCellsNum;
	}
	public static void main(String a[]){
		//test with steps 1,2,3,4
		System.out.println("Empty cells for step = 1 is : "+getEmptyCells(1));
		System.out.println("Empty cells for step = 2 is : "+getEmptyCells(2));
		System.out.println("Empty cells for step = 3 is : "+getEmptyCells(3));
		System.out.println("Empty cells for step = 4 is : "+getEmptyCells(4));
	}
}