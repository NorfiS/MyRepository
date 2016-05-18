package Sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String args[]){
		System.out.println("¬ведите число, которое будет");
		System.out.println("соответствовать длинне массива");
		
		Random r = new Random();//создаЄм рандом
		Scanner scn = new Scanner(System.in);//создаЄм сканер 
		
		int i = scn.nextInt();//считываем с клавиатуры вводимое число
		int a[] = new int [i];//устанавливаем длинну массива
		
		for(int j = 0; j < a.length; j++){
			a[j] = r.nextInt(999);//заполн€ем массив 
		}
		
		System.out.println(Arrays.toString(a));//выводим на экран полученный массив
		
		Map<Integer, Integer> cnt = new TreeMap <Integer, Integer>();//создаЄм Map
		for (int k = 0; k < a.length; k++){
			int c = a[k];//берЄм по одному значению из массива дл€ сравнени€
			if (!cnt.containsKey(c)){//сравниваем с содержимым Map
				cnt.put(c,1);//если нету такого значени€, присваеваем значение 1
			} else{
				int oldCnt = cnt.get(c);//если есть, достаЄм старое значение из Map
				cnt.put(c, oldCnt + 1);//увеличиваем на одно значение, и кладЄм обратно в Map
			}
		}
		System.out.println(cnt);//выводим на экран содержимое Map
	}

}
