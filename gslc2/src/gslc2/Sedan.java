package gslc2;

public class Sedan extends Car implements raceReady {

	public Sedan(String name, int year) {
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
	
	public void changeTires() {
		this.tireType = "Semi-Slick";
	}
	
	public void equipKits() {
		this.addition = "Splitter";
	}

}
