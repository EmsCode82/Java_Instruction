package ui;

import java.util.Scanner;

import business.Adventure;

public class ZombieKiller {

	public static void main(String[] args) {
		System.out.println(
				"After Dusk\n============================================================================================"
						+ "===============================================");
		IntroMenu();
	}

	private static void IntroMenu() {
		Scanner sc = new Scanner(System.in);
		String choice = "";
		{
			while (choice.equals("1")); {
				String intro = "The year is 2020 and civilization has grinded to a halt due to the relentless spread"
						+ " of a thus far unknown virus.\nThe Grid has fallen and resources are quickly becoming rare "
						+ "as riots and looting have taken over most major cities of the world.\nSociety has done its best"
						+ " to resist the disease but the alarming rate at which it spreads has proven to be more than humanity"
						+ " can handle.\nThere have been reports of cases where the infected lose all sanity and become mindless"
						+ " viscious zombies, attacking and killing \nanyone they come across futher spreading the plague. Full "
						+ "blown War has broken out across the planet as the remaining living souls fend \nfor"
						+ " themselves and their own. You were once a happy person... You at one time felt secure... All that"
						+ " has become shakingly uncertain as you \nhear a distant roar and rumbling like thunder get louder and closer"
						+ " to your now apparently fragile dwelling...." + "... \n"
						+ "================================================="
						+ "==========================================================================================\n"
						+ "1 - Start a new Game\n" + "2 - exit";
				System.out.println(intro);
				choice = sc.next();
			}
			switch (choice) {
			case "1":
				System.out.println(
						"====================================================================================================="
						+ "======================================"
						+ "\nYou awaken to find yourself in a very cramped, dark, and dusty area. A throbbing sensation perpetuates"
						+ " inside of your head as a loud \nringing in your ears slowly fades from your mind. You begin to realize"
						+ " you are experiencing shell shock. Everything around you has been \nutterly destroyed and you seem"
						+ " to be pinned underneath a large amount of rubble. Light dimmly shines through"
						+ " what appear to be cracks in a \nwall as you slowly gain consiousness and feeling in your limbs"
						+ " you try to pull yourself up to your feet. You almost get both of them on \nthe ground before you"
						+ " bang your head into what seems to be a steel beam. The space you are in is smaller than you thought."
						+ " Directly in \nfront of you is a large slab of concrete with rebar jutting out of its sides. You can see"
						+ " faintly through the dust, light shining in from \nthe outside. There is also what appears to be a drainage"
						+ " pipe leading directly into the sewer system underneath you. You listen and can \nhear strange growling"
						+ " noises and faint screams in the distance coming from the outside. Peering down into the pipe you can"
						+ " barely see 3 \nfeet in front of you because of the darkness.\n====="
						+ "=============================================================="
						+ "========================================================================");
				
				Adventure.ChooseM();
				break;
			case "2":
				System.out.println(
						"Your final thoughts are of java programming before you slip into unconsiousness, and eternity...");
				System.out.println("RIP");
				break;
			default:
				System.out.println("Invalid choice, try again.");
				break;
			}

		}
		sc.close();
	}
}
