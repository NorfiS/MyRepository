package Stec;

import java.util.Stack;

public class Add implements Cmd{
	public void exec(String parts[], Stack<Double> stack){
		double val = stack.pop() + stack.pop();//достаём из стэка последние два значения и складываем
		stack.push(val);//кладём в стэк полученное значение
	}
}
