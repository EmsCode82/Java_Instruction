package business;

import java.util.Scanner;

public class Adventure {
	public static void ChooseM() {
		System.out.println("What will you do?");
		System.out.println("1 Try to push the Concrete Slab loose and squeeze through the crack in the wall?");
		System.out.println("2 Slide down into the Drainage Pipe leading into the sewer?\n"
				+ "============================================================================================================="
				+ "==============================");
		Scanner sc = new Scanner(System.in);
		String choice1 = "";
		choice1 = sc.next();
		{
			if (choice1.equals("1")) {
				String choice11 = "==================================================================================================================="
						+ "========================\n"
						+ "You try pushing against the large Concrete Slab. It doesn't appear to be moving easily. You try again this time"
						+ " grasping onto a piece of \nthe rebar jutting out of the side of the slab. With all your might you push the rock"
						+ " over. It slams the ground shaking the very earth \nbeneath your feet and stirs up a cloud of dust preventing you"
						+ " from clearly seeing in front of you. You've been blinded by the dust cloud \nand light shining through into"
						+ " the rubble that is trying to become your earthly tomb \n======================================================="
						+ "====================================================================================";
				System.out.println(choice11);

			} 
			switch (choice1) {
     	   case "1":
     		   System.out.println("The blinding light and dust obstruct your vision forward " + "What will you do?");
				System.out.println("1 Walk out into the dust cloud to see what is outside?");
				System.out.println("2 Remain inside your hole until the dust settles?");
				System.out.println("3 Return to the sewer pipe and proceed into it\n"
						+ "============================================================================================================="
						+ "==============================");
				String choice2 = "";
				choice2 = sc.next();
				if (choice2.equals("1")) {
					System.out.println("You are immediately mauled by a ravenous zombie");
					if (choice2.equals("2")) {
						System.out.println("You wait for the dusk to settle. When it does you pear out of your hole and see a horde"
								+ "of infected people. They all turn to look at you");
						if (choice2.equals("3")) {
							System.out.println("You're not taking any chances out there. You choose to go down the sewer pipe.");
						}
					}
				}
     	   case "2": 
     		   System.out.println(
					"==================================================================================================================="
							+ "========================\n"
							+ "You begin to squeeze yourself down into the Drainage Pipe. Reaching your feet down into"
							+ " the darkness you fish for some solid footing \nunderneath but find none. The surface of"
							+ " the Pipe is slick and it causes you to begin to slide as you reach deeper into the darkness"
							+ " for a \nfoothold.\n======================================================="
							+ "====================================================================================");
                   if (choice1.equals("2")) {
                	   System.out.println("it really stinks down here");
                   }
			}
		}
	}	
}		