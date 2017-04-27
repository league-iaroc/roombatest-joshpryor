package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	 static int speed = 700;
	 static int three = 3000;
	 static int two = 1800;
	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
			
	}

	public void initialize() {
		gofront(two);
		leftTurn(90);
		gofront(1500);
		driveDirect(90,0);
		sleep(3200);
		gofront(1500);
		leftTurn(90);
		gofront(two);
		driveDirect(90,0);
		sleep(three);
		gofront(9999999);
		
	}

	public void loop() {
	
	}
	
	void leftTurn(int things){
		driveDirect(0,things);
		sleep(three);
		
	}
	
	void gofront( int time){
		driveDirect(speed,speed);
		sleep(time);
	}
}
