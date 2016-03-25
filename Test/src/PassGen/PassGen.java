package PassGen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class PassGen extends JFrame{
	JButton b1, b2;
	JLabel l1, l2, l3;
	JTextField t1,t2;
	int a, b;
	String s;
	Random r = new Random();
	int[] m ={0, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999};
	eHandler handler = new eHandler();
	
	public PassGen(String s){
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("Сгенерировать код");
		b2 = new JButton("Очистить");
		l1 = new JLabel("Укажите сколько знаков");
		l2 = new JLabel("в пароле вы хотите получить");
		l3 = new JLabel("    (от 1 до 9)    ");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(b1);
		add(t2);
		add(b2);
		b1.addActionListener(handler);
		b2.addActionListener(handler);
	}
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try{
				if(e.getSource() == b1){
					a = Integer.parseInt(t1.getText());
					if(a > 0 & a < 10){
						b = r.nextInt(m[a]);
						s ="" + b;
						t2.setText(s);
					}
					else{
						JOptionPane.showMessageDialog(null, "Не верное число");
						t1.setText(null);
						t2.setText(null);
					}
				}
				if(e.getSource() == b2){
					t1.setText(null);
					t2.setText(null);
				}
			}
			catch(Exception ex){
				JOptionPane.showMessageDialog(null, "Введите в поле число");
				t1.setText(null);
				t2.setText(null);
			}
		}
	}
}
