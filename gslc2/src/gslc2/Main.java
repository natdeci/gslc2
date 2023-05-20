package gslc2;
import java.util.Scanner;

/*
 Abstract class is a superclass that acts as a template for the subclass, however
 the abstract class itself could not be constructed, so no object can be made
 by being the abstract. It has the same behavior as superclass like using extends
 and can only extend exclusively to a subclass (only 1 abstract per class).
 Meanwhile, abstract method is a template method name for subclasses that will
 use the same method but could have different uses, as the code of the method will
 be decided on the subclass creation.
 
 On the other hand, we have interface which uses implements keyword instead of
 extends, and it serves as an additional template for a class. Many class can have
 multiple interfaces implemented to them, and they must follow their signature
 methods declared in the interface. Could also be used for classes that has several
 similar behavior that cannot came from 1 superclass.
 */

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SUV suv1 = new SUV("Bapuk", 2007);
//		suv1.changeOffroadTires();
//		suv1.equipLights();
//		suv1.getVehicleDetails();
		int menunum =  0;
		while(menunum != 6) {
			printmenu();
			int yesno = 0;
			menunum =  input.nextInt();
			if(menunum == 6) {
				break;
			}
			input.nextLine();
			System.out.print("Input car name: ");
			String carname = input.nextLine();
			System.out.print("Input car year: ");
			int caryear = input.nextInt();
			switch(menunum) {
			case 1:
				SUV suv1 = new SUV(carname, caryear);
				System.out.println("Do you want off-road tires for the car?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					suv1.changeOffroadTires();
				}
				
				System.out.println("Do you want additional lights for the car?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					suv1.equipLights();
				}
				
				System.out.println("Do you want to change the driving mode of the car (4x4)?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					suv1.changeMode();;
				}
				
				suv1.getVehicleDetails();
				break;
			case 2:
				Sedan sedan1 = new Sedan(carname, caryear);
				System.out.println("Do you want semi-slick tires for the car?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					sedan1.changeTires();
				}
				
				System.out.println("Do you want additional kits for the car?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					sedan1.equipKits();
				}
				
				System.out.println("Do you want to change the driving mode of the car (Sports)?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					sedan1.changeMode();
				}
				
				sedan1.getVehicleDetails();
				break;
			case 3:
				Hatchback hb1 = new Hatchback(carname, caryear);
				System.out.println("Do you want rally tires or semi-slick for the car?");
				System.out.println("1. Rally");
				System.out.println("2. Semi-slick");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					hb1.changeOffroadTires();
				} else if (yesno == 2) {
					hb1.changeTires();
				}
				
				System.out.println("Do you want additional lights or aero kit for the car?");
				System.out.println("1. Lights");
				System.out.println("2. Aero kit");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					hb1.equipLights();
				} else if (yesno == 2) {
					hb1.equipKits();
				}
				
				System.out.println("Do you want to change the driving mode of the car (Sports)?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					hb1.changeMode();;
				}
				
				hb1.getVehicleDetails();
				break;
			case 4:
				MPV mpv1 = new MPV(carname, caryear);
				System.out.println("Do you want off-road tires for the car?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					mpv1.changeOffroadTires();
				}
				
				System.out.println("Do you want additional lights for the car?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					mpv1.equipLights();
				}
				
				System.out.println("Do you want to change the driving mode of the car (Power)?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					mpv1.changeMode();;
				}
				
				mpv1.getVehicleDetails();
				break;
			case 5:
				SportsCar sc1 = new SportsCar(carname, caryear);
				System.out.println("Do you want performance tires for the car?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					sc1.changeTires();
				}
				
				System.out.println("Do you want additional kits for the car?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					sc1.equipKits();
				}
				
				System.out.println("Do you want to change the driving mode of the car (Performance)?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print(">> ");
				yesno = input.nextInt();
				if (yesno == 1) {
					sc1.changeMode();
				}
				
				sc1.getVehicleDetails();
				break;
			}
			menunum = askContinue();
		}
		System.out.println("         BYE-BYE       ");
	}
	
	static void printmenu() {
		System.out.println("         WELCOME       ");
		System.out.println("  Paulo's Custom Cars  ");
		System.out.println("///////////////////////");
		System.out.println("Choose Car Type: ");
		System.out.println("1. SUV");
		System.out.println("2. Sedan");
		System.out.println("3. Hatchback");
		System.out.println("4. MPV");
		System.out.println("5. Sports");
		System.out.println("6. Exit");
		System.out.println("-----------------------");
		System.out.print("Input menu >> ");
	}
	
	static int askContinue() {
		System.out.println("Continue?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.print(">> ");
		int contyesno = input.nextInt();
		if(contyesno == 1) {
			return 0;
		}
		return 6;
	}

}
