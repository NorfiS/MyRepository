package Low;

import java.util.ArrayList;

public class Low {
	public static void main(String [] args){
		ArrayList<Integer> primeVals = new ArrayList<Integer>();//создаём массив
		
		for(int i = 2; i < 100; i++){//берём значени по порядку из выбранного диапазона
			
			boolean isPrime = true;//присваеваем переменной значение true
			for (int p:primeVals){//берём по порядку значения из массива
				if(i % p == 0){//если выбранное значение при делении на значение из массива не оставляет остатка
					isPrime = false;//присваиваем переменной значение false
					break;//выходим из второго цикла for
				}
			}
			if(isPrime){//если переменная осталась true
				primeVals.add(i);//добавляем значение в массив
			}
		}
		System.out.println(primeVals);
	}
}
