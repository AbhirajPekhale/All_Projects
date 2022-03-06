package virtual_key;

public class LokedMe {

public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOpr.createMainFolderIfNotPresent("main");
		
		menuOptions.printWelcomeScreen("sara ltd", "abhiraj");
		
		HandleOption.handleWelcomeScreenInput();
	}
}
