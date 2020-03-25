import java.util.Scanner;

public class ShortCircuitApp {

	public static void main(String[] args) {
		System.out.println("Stop Light Approaching!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("What color is the light r,y,g? ");
		String light = sc.next();
		System.out.println("How far away is the light (feet)? ");
		int feet = sc.nextInt();
		System.out.println("How fast are you going");
		
		if (light.equalsIgnoreCase("r")) {
			//light is red - stop
		}
		else if (light.equalsIgnoreCase("y") && feet < 30) {
			//light is yellow and we are super close! - speed up!
			//how fast are we going?
			if(mph > 60) {
				// speed up!
			}
		}
		else if (light.equalsIgnoreCase("g")) {
			//light is green, keep going
		}
		else  {
				//light is green, keep going
		       //how fast are we going?
				
		}
		
	


