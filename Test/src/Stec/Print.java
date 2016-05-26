package Stec;

import java.util.Stack;

public class Print implements Cmd{
	public void exec(String parts[], Stack<Double> stack){
		System.out.println(stack);//выводим на экран содержимое стэка
	}
}
