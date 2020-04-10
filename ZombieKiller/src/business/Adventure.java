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
					System.out.println("You step out into the bright cloud in front of you. You hear strange growling noises"
							+ " from all sides and you sense that you are not alone. \nAs the dust settles to the ground it becomes"
							+ " more apparent that you are not. You start to see a figure emmerge from the dust...it is the \nform"
							+ " of a human but something is very wrong. It appears to be a person but their flesh is ravaged"
							+ " with wounds and their eyes are blackend \nand void of the appearance of sanity. You try wrapping"
							+ " your mind around what you are seeing and begin to think of things the way they were \nbefore all of"
							+ " destruction.... before you have a chance to react at all you are mauled by ravenous zombies and eaten"
							+ " while you still live... \ndarkness circles your mind and you slip out of consiousness, the last thing you"
							+ " see is a disfigured face eating your intestines.\n======================================================"
							+ "=====================================================================================");
					}
				if (choice2.equals("2")) {
					System.out.println("You wait for the dusk to settle. When it does you peer out of your hole and see a horde"
					+ " of infected people. They all turn to look at you. \nSince the dust has settled you can now see what is on"
					+ " the ground beneath you. A weathered 12 gauge shotgun sits at your feet. Just as you \nsee it an Angry Zombie"
					+ " begins rushing toward you. You reach down, pick up the shotgun and blow the disgruntled, rabid monsters,"
					+ "face off its neck.");
				}
				if (choice2.equals("3")) {
					System.out.println("You're not taking any chances out there. You choose to go down the sewer pipe.");
						}
     	   case "2":
     		  if (choice1.equals("2"))
     		   System.out.println(
					"==================================================================================================================="
							+ "========================\n"
							+ "You begin to squeeze yourself down into the Drainage Pipe. Reaching your feet down into"
							+ " the darkness you fish for some solid footing \nunderneath but find none. The surface of"
							+ " the Pipe is slick and it causes you to begin to slide as you reach deeper into the darkness"
							+ " for a \nfoothold. It really stinks down here but I appear to be safe for the time being\n======================================================="
							+ "====================================================================================");
                   if (choice1.equals("2")) {
                	   System.out.println("text line");
                   }
			}
		}
	}	
}		