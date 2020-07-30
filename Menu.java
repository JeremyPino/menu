//to have java scan for input

import java.util.Scanner;


public class Menu { 
	boolean exit;
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.runMenu();
	}
//output the header or "sign" of programs
//also goes through a while until exit is true

	public void runMenu() {
		printHeader();
		while(!exit) {
			printMenu();
			int choice = getInput();
			performAction(choice);
		}
	}

//this is the header or "sign"

	private void  printHeader(){
		System.out.println("+------------------------------------+");
		System.out.println("|        Welcome to BucksStar        |");
		System.out.println("|                                    |");
		System.out.println("|        What would you like?        |");
		System.out.println("+====================================+");
	}
//these are the menu items for the coffee shop

	private void printMenu(){
		System.out.println("\n Please select an option: ");
		System.out.println("1) Frappaccino");
		System.out.println("2) Coffee");
		System.out.println("3) Espresso");
		System.out.println("0) Exit");
	}
//this gets the input from the user and returns it to the while to check if it meets its conditions

	private int getInput(){
		Scanner kb = new Scanner(System.in);
		int choice = -1;
		while(choice < 0 || choice > 3) {
			try {
				System.out.print("\n Enter your choice number: ");
				choice = Integer.parseInt(kb.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid selection. Please try again.");
			}
		}
		return choice;
	}

//this is a switch statement that gives different output's depending on the user's input

	private void performAction(int choice){
		switch(choice){
			case 0:
				exit = true;
				System.out.println("Thank you for coming! :)");
				break;
			case 1:
				FrapDrink();
				int frap = frapInput();
				frapAction(frap);
				break;
			case 2:
				CoffDrink();
				int coff = coffInput();
				coffAction(coff);
				break;
			case 3:
				EsprDrink();
				int espr = esprInput();
				esprAction(espr);
				break;
			default:
				System.out.println("Oops! Something went wrong. An unknown error has occured :(");
		}
	}

//FRAPPACCINO	
//this is the frappaccino flavor menu

	private void FrapDrink() {
		System.out.println("\nWould you like your Frappaccino to be Mocha or Caramel?");
		System.out.println(" 1) Mocha");
		System.out.println(" 2) Caramel");
		System.out.println(" 0) Exit");
		
	}

//grabs user's preferred frappaccino flavor input

	private int frapInput(){
		Scanner fd = new Scanner(System.in);
		int frap = -1;
		while(frap < 0 || frap > 2) {
			try {
				System.out.print("\n Enter your choice number: ");
				frap = Integer.parseInt(fd.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid selection. Please try again.");
			}
		}
		return frap;
	}
	
//depending on the user's input of flavor, the switch statement will choos a final case

	private void frapAction(int frap){
		switch(frap){
			case 0:
				exit = true;
				System.out.println("Thank you for coming! :)");
				break;
			case 1:
				System.out.println("Your Mocha Frappaccino will be $5.00 \nThank you! :)");
				exit = true;
				break;
			case 2:
				System.out.println("Your Caramel Frappaccino will be $5.00 \nThank you! :)");
				exit = true;
				break;

			default:
				System.out.println("Oops! Something went wrong. An unknown error has occured :(");
		}
	}
//COFFEE
//this is the coffee temperature menu

	private void CoffDrink() {
		System.out.println("\nWould you like your Frappaccino to be Mocha or Caramel?");
		System.out.println(" 1) Hot");
		System.out.println(" 2) Iced");
		System.out.println(" 0) Exit");
		
	}

//grabs user's preferred coffee temperature input

	private int coffInput(){
		Scanner cd = new Scanner(System.in);
		int coff = -1;
		while(coff < 0 || coff > 2) {
			try {
				System.out.print("\n Enter your choice number: ");
				coff = Integer.parseInt(cd.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid selection. Please try again.");
			}
		}
		return coff;
	}
	
//depending on the user's input of temperature, the switch statement will choos a final case

	private void coffAction(int coff){
		switch(coff){
			case 0:
				exit = true;
				System.out.println("Thank you for coming! :)");
				break;
			case 1:
				System.out.println("Your Hot Coffee will be $2.50 \nThank you! :)");
				exit = true;
				break;
			case 2:
				System.out.println("Your Iced Coffee will be $2.50 \nThank you! :)");
				exit = true;
				break;

			default:
				System.out.println("Oops! Something went wrong. An unknown error has occured :(");
		}
	}
	
//ESPRESSO
//this is the espresso menu

private void EsprDrink() {
		System.out.println("\nWould you like your Frappaccino to be Mocha or Caramel?");
		System.out.println(" 1) Weak");
		System.out.println(" 2) Strong");
		System.out.println(" 0) Exit");
		
	}

//grabs user's preferred espresso input

	private int esprInput(){
		Scanner ed = new Scanner(System.in);
		int espr = -1;
		while(espr < 0 || espr > 2) {
			try {
				System.out.print("\n Enter your choice number: ");
				espr = Integer.parseInt(ed.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid selection. Please try again.");
			}
		}
		return espr;
	}
	
//depending on the user's preferred espresso input , the switch statement will choos a final case

	private void esprAction(int espr){
		switch(espr){
			case 0:
				exit = true;
				System.out.println("Thank you for coming! :)");
				break;
			case 1:
				System.out.println("Your weak Espresso will be $3.00 \nThank you! :)");
				exit = true;
				break;
			case 2:
				System.out.println("Your strong Espresso will be $3.00 \nThank You! :)");
				exit = true;
				break;

			default:
				System.out.println("Oops! Something went wrong. An unknown error has occured :(");
		}
	}


}















