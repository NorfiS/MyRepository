package Potoki;

class dick {
	public static void main(String[] args){
		Thread t1 = new Thread(new packs("первый"));
		Thread t2 = new Thread(new packs("второй"));
		Thread t3 = new Thread(new packs("третий"));
		t1.start();
		t2.start();
		t3.start();
	}
}
