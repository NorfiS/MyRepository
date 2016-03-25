package Baraban;

import javax.swing.JFrame;

public class Okno {
	
	public static void main(String[] args){
		Main m = new Main("RN");
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setSize(150, 200);
		m.setResizable(false);
		m.setLocationRelativeTo(null);
	}

}
