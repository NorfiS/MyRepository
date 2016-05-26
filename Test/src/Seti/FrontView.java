package Seti;
import javax.swing.*;

public class FrontView {
	public static void main(String[] args){
		WindowLog();
		WindowReg();
	}

	private static void WindowLog() {
		WindowLog frame = new WindowLog();
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setTitle("Log");
		
	}
	private static void WindowReg() {
		WindowReg frame1 = new WindowReg();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(false);
		frame1.setSize(300, 200);
		frame1.setLocationRelativeTo(null);
		frame1.setResizable(false);
		frame1.setTitle("Reg");
	}
}
