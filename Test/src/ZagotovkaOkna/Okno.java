package ZagotovkaOkna;
import javax.swing.*;

public class Okno 
{
	public static void main(String[] args)
	{
		MyT frame = new MyT();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setTitle("Frame");
	}

}