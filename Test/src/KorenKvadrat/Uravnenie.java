package KorenKvadrat;

public class Uravnenie {
	public static void main(String args[]){
		double a = 1;
		double b = -2;
		double c = 0 ;
		double d = b * b - 4 * a * c;
		
		if (d > 0) {
			double y1;
			double y2;
			double x1;
			double x2;
			double x3;
			double x4;
			y1 = (-b + Math.sqrt(d)) / 2 / a;
			y2 = (-b - Math.sqrt(d)) / 2 / a;
			if (y1 > 0){
				x1 = Math.sqrt(y1);
				x2 = - Math.sqrt(y1);
				System.out.println(x1);
				System.out.println(x2);
			}
			if (y2 > 0){
				x3 = Math.sqrt(y2);
				x4 = - Math.sqrt(y2);
				System.out.println(x3);
				System.out.println(x4);
			}		
		}
		if (d == 0) {
			double y;
			double x1;
			double x2;
			y = - b / (2 * a);
			if (y > 0){
				x1 = Math.sqrt(y);
				x2 = - Math.sqrt(y);
				System.out.println(x1);
				System.out.println(x2);
			}
			if (y < 0){
				System.out.println("Решений нет");
			}
		}
		if (d < 0) {
			System.out.println("NO ROOTS!");
		}
	}
}
