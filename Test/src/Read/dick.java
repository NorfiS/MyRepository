package Read;
import java.util.Scanner;
import javax.swing.*;
import java.io.File;

public class dick {
	static String[][] m = new String[5][3];
	static Scanner scn;
	public static void main(String args[]){
		openFile();
		readfile();
		out();
	}
	private static void out(){
		for(int row = 0; row < m.length; row++){
			for(int col = 0; col < m[row].length; col++){
				System.out.print(m[row][col] + "  ");
			}
			System.out.println();
		}
	}
	private static void readfile(){
		while(scn.hasNext()){
			for(int row = 0; row < m.length; row++){
				for(int col = 0; col < m[row].length; col++){
					m[row][col] = scn.next();
				}
			}
		}
	}
	private static void openFile(){
		try{
			scn = new Scanner(new File("res//1.txt"));
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "���� �� ������");
			}
	}
}