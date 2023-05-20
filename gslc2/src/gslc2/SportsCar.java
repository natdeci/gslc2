package gslc2;

public class SportsCar extends Car implements raceReady {

	public SportsCar(String name, int year) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.year = year;
	}
	
	public void changeMode() {
		if (this.drivingMode.equals("Normal")) {
			this.drivingMode = "Performance";
		} else {
			this.drivingMode = "Normal";
		}
	}
	
	public void changeTires() {
		this.tireType = "Performance";
	}
	
	public void equipKits() {
		this.addition = "Aero Kit";
	}

}
