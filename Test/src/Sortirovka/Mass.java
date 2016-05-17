package Sortirovka;

import java.util.Arrays;

public class Mass {
	public static void main(String args[]) {
		int [] m = {2, 4, 1, 5, 3};
		int i = 0;
		int s = 0;
		while (true){
			if (m[i] > m[i + 1]){
				int p;
				p = m[i];
				m[i] = m[i + 1];
				m[i + 1] = p;
				s = 0;
			}
			i++;
			s++;
			System.out.println(Arrays.toString(m));
			if(i == m.length - 1){
				i = 0;
			}
			if (s == m.length -1){
				break;
			}
		}
	}

}
