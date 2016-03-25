package Baraban;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main extends JFrame{
	JButton b1, b2;
	JTextField t1, t2, t3;
	JLabel l1, l2, l3, l4;
	int a, b, x, y = 0;
	String s;
	Random r = new Random();
	int[] m = {0, 9, 99, 999};
	RandomNumber rn = new RandomNumber();
	
	public Main(String s){
		super (s);
		setLayout(new FlowLayout());
		b1 = new JButton("Получить число");
		b2 = new JButton("Очистить");
		t1 = new JTextField(3);
		t2 = new JTextField(3);
		t3 = new JTextField(10);
		l1 = new JLabel("Внесите числа в поля");
		l2 = new JLabel("от");
		l3 = new JLabel("до");
		l4 = new JLabel("Результат");
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		add(l4);
		add(t3);
		add(b2);
		b1.addActionListener(rn);
		b2.addActionListener(rn);
	}
	public class RandomNumber implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				if(e.getSource() == b1){
					a = Integer.parseInt(t1.getText());
					b = Integer.parseInt(t2.getText());
					if(b < 10){
						y = 1;
					}
					if(b < 100){
						y = 2;
					}
					if(b < 1000){
						y = 3;
					}
					x = a - 1;
					if(a < 0 | b < 0){
						JOptionPane.showMessageDialog(null, "Введено неверное значение!");
						t1.setText(null);
						t2.setText(null);
					}
					else{
						if(b > 999){
						JOptionPane.showMessageDialog(null, "Введено большое значение!");
						t1.setText(null);
						t2.setText(null);
					}
						else{
							if(a > b){
								JOptionPane.showMessageDialog(null, "Введены неверные значения");
								t1.setText(null);
								t2.setText(null);
								}
							else{
								if(a != b){
									while(a > x){
										x = r.nextInt(m[y]);
										while(b < x){
											x = r.nextInt(m[y]);
											}
										}
									s ="" + x;
									t3.setText(s);
									}
								else{
									JOptionPane.showMessageDialog(null, "Введены неверные значения!");
									t1.setText(null);
									t2.setText(null);
									}
								}
							}
						}
					}	
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Введите в поле число!");
					t1.setText(null);
					t2.setText(null);
					}
			if(e.getSource() == b2){
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
			}	
		}	
	}
}
