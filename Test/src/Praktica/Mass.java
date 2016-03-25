package Praktica;

public class Mass {
	public static void main(String[] args){
		int[][] m = {{2,5,6,8},{3,1,4},{9,7}};
		for (int row = 0; row < m.length; row++){
			for (int col = 0; col < m[row].length; col++){
				System.out.print(m[row][col] + "  ");
			}
			System.out.println();
		}
	}

}
