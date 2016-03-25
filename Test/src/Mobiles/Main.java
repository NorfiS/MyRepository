package Mobiles;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	private static ArrayList<Mobiles> mobiles = new ArrayList<Mobiles>();
	private static Random r = new Random();
	
	public static void main(String[] args) {
		for(int i = 0; i < 300; i++){
			mobiles.add(new Mobiles(r.nextInt(9999999), "HTC"));
		}
		for(Mobiles m: mobiles){
			System.out.println(m.getNumber() + " " + m.getName());
		}
	}

}