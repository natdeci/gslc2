package gslc2;

public class Hatchback extends Car implements offroadReady, raceReady {

	public Hatchback(String name, int year) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.year = year;
	}
	
	public void changeMode() {
		if (this.drivingMode.equals("Normal")) {
			this.drivingMode = "Sports";
		} else {
			this.drivingMode = "Normal";
		}
	}
	
	public void changeOffroadTires() {
		this.tireType = "Rally";
	}
	
	public void equipLights() {
		this.addition = "Roof Lights";
	}
	
	public void changeTires() {
		this.tireType = "Semi-Slick";
	}
	
	public void equipKits() {
		this.addition = "Aero Kit";
	}

}
