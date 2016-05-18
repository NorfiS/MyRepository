package Sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String args[]){
		System.out.println("������� �����, ������� �����");
		System.out.println("��������������� ������ �������");
		
		Random r = new Random();//������ ������
		Scanner scn = new Scanner(System.in);//������ ������ 
		
		int i = scn.nextInt();//��������� � ���������� �������� �����
		int a[] = new int [i];//������������� ������ �������
		
		for(int j = 0; j < a.length; j++){
			a[j] = r.nextInt(999);//��������� ������ 
		}
		
		System.out.println(Arrays.toString(a));//������� �� ����� ���������� ������
		
		Map<Integer, Integer> cnt = new TreeMap <Integer, Integer>();//������ Map
		for (int k = 0; k < a.length; k++){
			int c = a[k];//���� �� ������ �������� �� ������� ��� ���������
			if (!cnt.containsKey(c)){//���������� � ���������� Map
				cnt.put(c,1);//���� ���� ������ ��������, ����������� �������� 1
			} else{
				int oldCnt = cnt.get(c);//���� ����, ������ ������ �������� �� Map
				cnt.put(c, oldCnt + 1);//����������� �� ���� ��������, � ����� ������� � Map
			}
		}
		System.out.println(cnt);//������� �� ����� ���������� Map
	}

}
