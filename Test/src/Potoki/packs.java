package Potoki;
import java.util.Random;
class packs implements Runnable{
	int time;
	String name;
	Random r = new Random();
	public packs(String name){
		this.name = name;
		time = r.nextInt(1000);
	}
	public void run() {
		System.out.printf("Поток %s спит %d\n", name, time);
		try{
			Thread.sleep(time);
		}catch(Exception e){}
		System.out.printf("Поток %s проснулся и закончился\n", name);
	}
}
