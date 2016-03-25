package kalkulator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Two extends JFrame{
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14,
	b15, b16, b17, b18;
	JTextField t1;
	int a, d1, d2, d3, d4, r;
	int y = 0;
	String s1 = "7", s2 = "8", s3 = "9", s5 = "4", s6 = "5", s7 = "6",
			s9 = "1", s10 = "2", s11 = "3", s13 = "0", s18 = ".";
	eHandler handler = new eHandler();
	public Two(String s){
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("7");
		b2 = new JButton("8");
		b3 = new JButton("9");
		b4 = new JButton("/");
		b5 = new JButton("4");
		b6 = new JButton("5");
		b7 = new JButton("6");
		b8 = new JButton("*");
		b9 = new JButton("1");
		b10 = new JButton("2");
		b11 = new JButton("3");
		b12 = new JButton("-");
		b13 = new JButton("0");
		b14 = new JButton("+-");
		b15 = new JButton("=");
		b16 = new JButton("+");
		b17 = new JButton("             CE            ");
		b18 = new JButton(" ,");
		t1 = new JTextField("0",15);
		add(t1);
		add(b17);
		add(b14);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b18);
		add(b15);
		add(b16);
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		b10.addActionListener(handler);
		b11.addActionListener(handler);
		b12.addActionListener(handler);
		b13.addActionListener(handler);
		b14.addActionListener(handler);
		b15.addActionListener(handler);
		b16.addActionListener(handler);
		b17.addActionListener(handler);
		b18.addActionListener(handler);	
	}
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try{
				if(e.getSource() == b1){//кнопка 7
					a = Integer.parseInt(t1.getText());
					if(y == 5){
						a = 0;
						}
					if(a == 0){
						a = 0 + 7;
						t1.setText(a + "");
					}
					else{
						t1.setText(a + s1);
					}
					}
			    }
		    catch(Exception ex){t1.setText(s1);}
			try{
				if(e.getSource() == b2){//кнопка 8
					a = Integer.parseInt(t1.getText());
					if(y == 5){
						a = 0;
						y = 0;
						}
					if(a == 0){
						a = 0 + 8;
						t1.setText(a + "");
					}
					else{
						t1.setText(a + s2);
					}
					}
			    }
		    catch(Exception ex){t1.setText(s2);}
			try{
				if(e.getSource() == b3){//кнопка 9
					a = Integer.parseInt(t1.getText());
					if(y == 5){
						a = 0;
						y = 0;
						}
					if(a == 0){
						a = 0 + 9;
						t1.setText(a + "");
					}
					else{
						t1.setText(a + s3);
					}
					}
			    }
	        catch(Exception ex){t1.setText(s3);}
			try{
				if(e.getSource() == b5){//кнопка 4
					a = Integer.parseInt(t1.getText());
					if(y == 5){
						a = 0;
						y = 0;
						}
					if(a == 0){
						a = 0 + 4;
						t1.setText(a + "");
					}
					else{
						t1.setText(a + s5);
					}
					}
			    }
            catch(Exception ex){t1.setText(s5);}
			try{
				if(e.getSource() == b6){//кнопка 5
					a = Integer.parseInt(t1.getText());
					if(y == 5){
						a = 0;
						y = 0;
						}
					if(a == 0){
						a = 0 + 5;
						t1.setText(a + "");
					}
					else{
						t1.setText(a + s6);
					}
					}
			    }
            catch(Exception ex){t1.setText(s6);}
			try{
				if(e.getSource() == b7){//кнопка 6
					a = Integer.parseInt(t1.getText());
					if(y == 5){
						a = 0;
						y = 0;
						}
					if(a == 0){
						a = 0 + 6;
						t1.setText(a + "");
					}
					else{
						t1.setText(a + s7);
					}
					}
			    }
            catch(Exception ex){t1.setText(s7);}
			try{
				if(e.getSource() == b9){//кнопка 1
					a = Integer.parseInt(t1.getText());
					if(y == 5){
						a = 0;
						y = 0;
						}
					if(a == 0){
						a = 0 + 1;
						t1.setText(a + "");
					}
					else{
						t1.setText(a + s9);
					}
					}
			    }
            catch(Exception ex){t1.setText(s9);}
			try{
				if(e.getSource() == b10){//кнопка 2
					a = Integer.parseInt(t1.getText());
					if(y == 5){
						a = 0;
						y = 0;
						}
					if(a == 0){
						a = 0 + 2;
						t1.setText(a + "");
					}
					else{
						t1.setText(a + s10);
					}
					}
			    }
            catch(Exception ex){t1.setText(s10);}
			try{
				if(e.getSource() == b11){//кнопка 3
					a = Integer.parseInt(t1.getText());
					if(y == 5){
						a = 0;
						y = 0;
						}
					if(a == 0){
						a = 0 + 3;
						t1.setText(a + "");
					}
					else{
						t1.setText(a + s11);
					}
					}
			    }
            catch(Exception ex){t1.setText(s11);}
			try{
			    if(e.getSource() == b13){//кнопка 0
					a = Integer.parseInt(t1.getText());
					if(y == 5){
						a = 0;
						y = 0;
						}
					if(a == 0){
						a = 0;
						t1.setText(a + "");
					}
					else{
						t1.setText(a + s13);
					}
					}
			    }
            catch(Exception ex){t1.setText(s13);}
//			try{
//				if(e.getSource() == b18){//кнопка ,
//					a = Integer.parseInt(t1.getText());
//					if(a == 0){
//						a = 0;
//						t1.setText(a + "");
//					}
//					else{
//						t1.setText(a + s18);
//					}
//					}
//			    }
//            catch(Exception ex){t1.setText(a + "");}
			try{
				if(e.getSource() == b14){//кнопка +-
					a = Integer.parseInt(t1.getText());
					a = 0 - a;
					t1.setText(a + "");
					}
				}
			catch(Exception ex){t1.setText("0");}
			try{
				if(e.getSource() == b4){//кнопка /
					a = Integer.parseInt(t1.getText());
					if (y == 0){
						r = a;
					}
					if (y == 1){
						r = d1 / a;
					}
					if (y == 2){
						r = d2 * a;
					}
					if (y == 3){
						r = d3 - a;
					}
					if (y == 4){
						r = d4 + a;
					}
					t1.setText(r + "");
					a = Integer.parseInt(t1.getText());
				    y = 1;
				    d1 = a;
				    t1.setText(d1 + "/");
				    }
				 }
			catch(Exception ex){t1.setText("0");}
			try{
				if(e.getSource() == b8){//кнопка *
					a = Integer.parseInt(t1.getText());
					if (y == 0){
						r = a;
					}
					if (y == 1){
						r = d1 / a;
					}
					if (y == 2){
						r = d2 * a;
					}
					if (y == 3){
						r = d3 - a;
					}
					if (y == 4){
						r = d4 + a;
					}
					t1.setText(r + "");
					a = Integer.parseInt(t1.getText());
					y = 2;
					d2 = a;
					t1.setText(d2 + "*");
					}
				}
			catch(Exception ex){t1.setText("0");}
			try{
				if(e.getSource() == b12){//кнопка -
					a = Integer.parseInt(t1.getText());
					if (y == 0){
						r = a;
					}
					if (y == 1){
						r = d1 / a;
					}
					if (y == 2){
						r = d2 * a;
					}
					if (y == 3){
						r = d3 - a;
					}
					if (y == 4){
						r = d4 + a;
					}
					t1.setText(r + "");
					a = Integer.parseInt(t1.getText());
					y = 3;
					d3 = a;
					t1.setText(d3 + "-");
					}
				}
			catch(Exception ex){t1.setText("0");}
			try{
				if(e.getSource() == b16){//кнопка +
					a = Integer.parseInt(t1.getText());
					if (y == 0){
						r = a;
					}
					if (y == 1){
						r = d1 / a;
					}
					if (y == 2){
						r = d2 * a;
					}
					if (y == 3){
						r = d3 - a;
					}
					if (y == 4){
						r = d4 + a;
					}
					t1.setText(r + "");
					a = Integer.parseInt(t1.getText());
					y = 4;
					d4 = a;
					t1.setText(d4 + "+");
					}
				}
			catch(Exception ex){t1.setText("0");}
			try{
				if(e.getSource() == b15){//кнопка =
					a = Integer.parseInt(t1.getText());
					if (y == 0){
						r = a;
					}
					if (y == 1){
						r = d1 / a;
					}
					if (y == 2){
						r = d2 * a;
					}
					if (y == 3){
						r = d3 - a;
					}
					if (y == 4){
						r = d4 + a;
					}
					t1.setText(r + "");
					y = 5;
					}
				}
			catch(Exception ex){t1.setText(r + "");}
			
			if(e.getSource() == b17){//кнопка CE
				t1.setText("0");
				y = 0;
			}
		}
		
	}

}
