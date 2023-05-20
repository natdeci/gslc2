package gslc2;

public class SUV extends Car implements offroadReady {

	public SUV(String name, int year) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.year = year;
	}

	public void changeMode() {
		if (this.drivingMode.equals("Normal")) {
			this.drivingMode = "4x4";
		} else {
			this.drivingMode = "Normal";
		}
	}
	
	public void changeOffroadTires() {
		this.tireType = "Off-Road";
	}
	
	public void equipLights() {
		this.addition = "Roof Lights";
	}
}
