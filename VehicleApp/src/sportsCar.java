
public class sportsCar extends Car{

	public sportsCar(String name, boolean isManual) {
		super(name, "sportsCar", 4, 2, 6, isManual);
	}
	
	public void accelarate(int rate) {
		int newSpeed = getCurrentSpeed() + rate;
		
		/*
		 * speed=0 : gear 1
		 * speed 0 - 10 : gear 1
		 * speed 10 - 20 : gear 2
		 * speed 20 - 30 : gear 3
		 * speed 30 - 50 : gear 4
		 * speed 50 - 70 : gear 5
		 * speed > 70 : gear 6
		 */
		
		if(newSpeed > 70) {
			changeGear(6);
		}else if(newSpeed > 50) {
			changeGear(5);
		}else if(newSpeed > 30) {
			changeGear(4);
		}else if(newSpeed > 20) {
			changeGear(3);
		}else if(newSpeed > 10) {
			changeGear(2);
		}else if(newSpeed > 0) {
			changeGear(1);
		}else if(newSpeed == 0) {
			stop();
			changeGear(1);
		}else {
			System.out.println("Invalid speed!");
		}
		
		if(newSpeed > 0) {
			changeSpeed(newSpeed, getCurrentDirection());
		}
	}

}
