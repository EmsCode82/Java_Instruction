package ui;

public class TernaryOperatorApp {

	public static void main(String[] args) {
		System.out.println("Red Light Green Light Game");
		// red light, green light... what to do?
		String lightColor = "red";
		System.out.println("Light Color is: "+lightColor);
		String action = "";
		// set the action based on lightColor
		// -if/else example
		//if (lightColor.equalsIgnoreCase("red")) {
	//		action = "stop";
	//	}
	//	else {
	//		action = "go";
	//	}
		action = lightColor.equalsIgnoreCase("red") ? "Stop" : "Go";
		System.out.println("Action is: "+action);
		
		System.out.println("Bye");
	}

}
