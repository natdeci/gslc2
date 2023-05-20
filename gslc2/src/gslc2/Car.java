package gslc2;

abstract class Car{
	public String name;
	public int year;
	public String tireType = "Factory";
	public String addition = "None";
	public String drivingMode = "Normal";
	public void getVehicleDetails() {
		System.out.println("Car Name: " + name + "\nyear: " + year + "\nTires: " + tireType + "\nAddition: " + addition + "\nDrive Mode: " + drivingMode);
	}
	abstract public void changeMode();
}