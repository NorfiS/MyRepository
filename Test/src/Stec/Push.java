package Stec;

import java.util.Stack;

public class Push implements Cmd{
	public void exec(String parts[], Stack<Double> stack){
		stack.push(Double.valueOf(parts[1]));//����� � ���� ������ ������� ����������� �������
		//�������������� �������� � Double
	}
}
