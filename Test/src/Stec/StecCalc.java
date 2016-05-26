package Stec;

import java.util.*;

public class StecCalc {
	public static void main(String[] args){
		Stack<Double> stack = new Stack<Double>();//������� Stack
		Scanner s = new Scanner(System.in);//������� ������ ��� ���������� � ����������
		Map<String, Cmd> cmds = new HashMap<String, Cmd>();//������ Map
		cmds.put("PUSH", new Push());//����� � Map ������� Push
		cmds.put("PRINT", new Print());//����� � Map ������� Print
		cmds.put("ADD", new Add());//����� � Map ������� Add
		while(true){//���� ��������� ���������� � ����������
			String line = s.nextLine();//��������� �� ����� ������
			String[] parts = line.split(" ");//��������� ������ �� ������� � ���������� � ������
			String cmdName = parts[0].toUpperCase();//����� ������ �������	
			//�������� � ������� �������
			cmds.get(cmdName).exec(parts, stack);//����������� ������� �� Map
			//� ������� �� ���������� � ����������� ������ � �����
		}
	}
}
