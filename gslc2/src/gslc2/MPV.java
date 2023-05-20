package gslc2;

public class MPV extends Car implements offroadReady {

	public MPV(String name, int year) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.year = year;
	}
	
	public void changeMode() {
		if (this.drivingMode.equals("Normal")) {
			this.drivingMode = "Power";
		} else {
			this.drivingMode = "Normal";
		}
	}
	
	public void changeOffroadTires() {
		this.tireType = "Light Off-Road";
	}
	
	public void equipLights() {
		this.addition = "Bumper Lights";
	}

}
