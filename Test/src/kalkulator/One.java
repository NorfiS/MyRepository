package kalkulator;

import javax.swing.JFrame;

public class One {
	public static void main(String args[]){
		Two x = new Two("Калькулятор");
		x.setVisible(true);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setSize(210, 220);
		x.setResizable(false);
		x.setLocationRelativeTo(null);
	}

}
