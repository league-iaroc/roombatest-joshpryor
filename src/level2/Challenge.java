package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
		int speed = 700 ;
	}

	public void initialize() {
int speed = 700 ;
driveDirect(speed,speed);
sleep(2000);
driveDirect(0,90);
sleep(3200);
driveDirect(speed,speed);
sleep(3500);
driveDirect(90,0);
sleep(3000);
driveDirect(speed,speed);

	}
	

	public void loop() {
	
	}
}
