package Low;

import java.util.ArrayList;

public class Low {
	public static void main(String [] args){
		ArrayList<Integer> primeVals = new ArrayList<Integer>();//������ ������
		
		for(int i = 2; i < 100; i++){//���� ������� �� ������� �� ���������� ���������
			
			boolean isPrime = true;//����������� ���������� �������� true
			for (int p:primeVals){//���� �� ������� �������� �� �������
				if(i % p == 0){//���� ��������� �������� ��� ������� �� �������� �� ������� �� ��������� �������
					isPrime = false;//����������� ���������� �������� false
					break;//������� �� ������� ����� for
				}
			}
			if(isPrime){//���� ���������� �������� true
				primeVals.add(i);//��������� �������� � ������
			}
		}
		System.out.println(primeVals);
	}
}
