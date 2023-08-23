
public class Main {

	public static void main(String[] args) {
		
		sportsCar porsche = new sportsCar("Porsche Boxster", false);
		
		porsche.move(20, 10);
		porsche.accelarate(40);
		porsche.accelarate(-60);
		System.out.println("Current gear: " + porsche.getCurrentGear());
		System.out.println("Current speed: " + porsche.getCurrentSpeed());

	}

}
