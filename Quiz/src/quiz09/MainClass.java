package quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAp ap = new SuperSonicAp("종이비행기");
		
		ap.takeOff();
		ap.fly(); //override
		ap.flyMode = 1;
		ap.fly();
		ap.land();
		
	}
}
