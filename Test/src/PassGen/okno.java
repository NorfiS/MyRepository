package PassGen;

import javax.swing.JFrame;

public class okno {
	public static void main(String[] args){
		PassGen p = new PassGen("PassGen");
		p.setVisible(true);
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setSize(200, 220);
		p.setResizable(false);
		p.setLocationRelativeTo(null);
	}

}
