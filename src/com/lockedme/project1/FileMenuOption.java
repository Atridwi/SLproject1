package com.lockedme.project1;


import java.util.Scanner;

public class FileMenuOption {

	public static void printWelcomeScreen(String appName, String developerName) {
		System.out.println("Application Name: LockedMe.com "+"\n         Welcome to Lockedme.com ");
		System.out.println("This application was developed by Anamika dwivedi.\n");
		System.out.printf(appName, developerName);
		
		System.out.println("  You can use this application to :\n");
		
		System.out.println("     � Retrieve all files  in the \"main\" folder.\n");
		System.out.println("     � Search, add, or delete files in \"main\" folder.\n");
		System.out.println("\n** Please Ensure that , you provide the correct file name for searching or deleting files.**\n");
		

		
	}
	
	public static void displayMenuScreen() {
		System.out.println("Select any option number from below (e.g.1/2/3)and press Enter\n");
		System.out.println(      "1) Retrieve all files inside \"main\" folder in assending order \n" );
		System.out.println(      "2) Display menu for File operations\n");
		System.out.println(      "3) Exit program\n");
		

	}

	public static void displayFileMenuOptions() {
		System.out.println("\n Select any optionfrom below(e.g.1/2/3/4/5) and press Enter \n");
		System.out.println(      "1) Add a file to \"main\" folder\n");
		System.out.println(      "2) Delete a file from \"main\" folder\n");
	    System.out.println(      "3) Search for a file from \"main\" folder\n");
	    System.out.println(      "4) Show Previous Menu  or go to menu \n"); 
	    System.out.println(      "5) Exit program\n");

		
	}

}
