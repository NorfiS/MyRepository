package Sortirovka;

import java.util.Arrays;

public class Mass2 {
	public static void main(String args[]) {
		int [] m = {2, 4, 1, 5, 3};
		int i = 0;
		for(int k = 0; k < m.length - 1; k++){
			i = 0;
			while(i < m.length - 1){
				if (m[i] > m[i + 1]){
					int p;
					p = m[i];
					m[i] = m[i + 1];
					m[i + 1] = p;
				}
				i++;
				System.out.println(Arrays.toString(m));
			}
		}
	}
}
