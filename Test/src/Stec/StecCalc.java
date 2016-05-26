package Stec;

import java.util.*;

public class StecCalc {
	public static void main(String[] args){
		Stack<Double> stack = new Stack<Double>();//создали Stack
		Scanner s = new Scanner(System.in);//создали сканер для считывания с клавиатуры
		Map<String, Cmd> cmds = new HashMap<String, Cmd>();//создаём Map
		cmds.put("PUSH", new Push());//кладём в Map команду Push
		cmds.put("PRINT", new Print());//кладём в Map команду Print
		cmds.put("ADD", new Add());//кладём в Map команду Add
		while(true){//цикл считываем бесконечно с клавиатуры
			String line = s.nextLine();//считываем по одной строке
			String[] parts = line.split(" ");//разделяем строки по пробелу и укладываем в массив
			String cmdName = parts[0].toUpperCase();//взяли первый элемент	
			//перевели в верхний регистр
			cmds.get(cmdName).exec(parts, stack);//вытаскиваем команду из Map
			//и передаём на исполнение с параметрами строки и стэка
		}
	}
}
