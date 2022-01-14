package com.lockedme.project1;


public class LockedMeMainProgram {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotExist("main");
		
		FileMenuOption.printWelcomeScreen("LockedMe.com", "Anamika dwivedi");
		
		FileHandleOption.handleWelcomeScreenInput();
	}

	
}
