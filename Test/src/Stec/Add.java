package Stec;

import java.util.Stack;

public class Add implements Cmd{
	public void exec(String parts[], Stack<Double> stack){
		double val = stack.pop() + stack.pop();//������ �� ����� ��������� ��� �������� � ����������
		stack.push(val);//����� � ���� ���������� ��������
	}
}
