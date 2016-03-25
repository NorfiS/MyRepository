package Mobile;

public class Main {
	private static Mobile[] mobile = new Mobile[3];
	
	public static void main(String[] args){
		mobile[0] = new Mobile(5453477, "IPhone");
		mobile[1] = new Mobile(9956534, "Samsung");
		mobile[2] = new Mobile(6556724, "Nokia");
		
		for(Mobile m:mobile){
			System.out.println(m.getNumber() + " " + m.getName());
		}
	}
	

}
