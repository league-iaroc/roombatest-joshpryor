package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		driveDirect(100,100);
		sleep(4000);
		driveDirect(00,90);
		sleep(200);
		
		driveDirect(80,100);
		sleep(17000);
		driveDirect(100,100);
		sleep(26000);
		driveDirect(00,90);
		sleep(4000);
		driveDirect(555,555);
		
		
		
		
		
		
	}

	public void loop() {
	
	}
}
