import java.io.*;
import java.util.*;
import java.lang.Math;

public class Driver{
    public static void main(String[] args){
		clearScreen();
		System.out.println("Welcome to STUYABLO!");
		wait(2000);
		System.out.println("Choose your class:");
		//wait(1000);
       	System.out.println("0) Akholyte or 1) Warrior");
		//wait(1000);
	
		Scanner sc = new Scanner(System.in);
		String choice;
		choice = sc.nextLine();
		if(choice.equals("0")){
	    	System.out.println("Good choice!\n");
		}
		else{
	    	System.out.println("You're a Stuy student. Really?\nYou're an Akhloyte.i\n");
		}
		wait(450);
		//clearScreen();
		System.out.println("What is your name?");
		String name;
		name = sc.nextLine();
		Akholyte a;
		a = new Akholyte(name);
		wait(1000);
		//System.out.println("\n");
		clearScreen();
		System.out.println(a + ", you are finally ready to play STUYABLO!\n");  
		wait(3000);
		System.out.println("You are on the 10th floor of Sayvetstun.\nThe evil overlord Nomar has confiscated your cellphone!");
		wait(1000);
		System.out.println("You must make your way to the 1st floor to find Nomar and defeat him,\nso you can reclaim your cellphone!");
		wait(1000);
		System.out.println("Come on now, no time to waste!");
		wait(1000);
		System.out.println("running...");
		wait(1000);
		System.out.println("running...");
		wait(1000);

		System.out.println("Oh look, one of Nomar's grunts is standing in your way. Defeat him to move forward!");
		wait(3000);

		System.out.println("*dramatic music plays*");
		wait(5000);

		Nomar n = new Nomar("Nomar Grunt");
		n.setStats(a);
		System.out.println("You have been challenged by a " + n + "!");
		System.out.println("Will you \n 0) Fight \n 1) Run ?");
		choice = sc.nextLine();
		if(choice.equals("0")){
	    	System.out.println("Good choice!");
		}
		else{
	    	System.out.println("Don't be a wimp! You're fighting!");
		}

		wait(3000);

		clearScreen();

		//Actual Encounter
		
		int stage = 0;
		int turnCount = 0;

		while (!(a.getHP() <= 0 || n.getHP() <= 0)) {

			clearScreen();

			if (turnCount % ((20 - a.getConst())) == 0) {
				a.setStamina(a.getStamina() + 2);
				a.setHP(a.getHP() + 2);
			}
			
			a.getStatusBar();	
			//System.out.println("The " + n.getName() + " has " + n.getHP() + " HP!!");
			//System.out.println();


			if (stage == 0) { // You attack
				a.attack(n);
				stage = 1;
			}

			else if (stage == 1) { // They attack
				n.attack(a);
				stage = 0;
			}
		
			//System.out.println();
			//System.out.println("You have " + a.getHP() + " HP left!!");
			//System.out.println("The " + n.getName() + " has " + n.getHP() + " HP left!!");
			//System.out.println();

			turnCount++;
		}

		if (a.getHP() == 0) {
			a.die();
			return;
		}
	
        /*
	  Should exp gain and leveling up be handled in the attack method? 
	  If not, how should we handle that? Create a method called "checklevel" in Basechar
	  and use it to level up the character if they hit a new level?
	  I really don't think that should be in the driver.
	  So like after a.attack(n) resolves we should call a.checklevel(n)?
	*/
		
		clearScreen();

		System.out.println("Good job! You defeated the Nomar Grunt!");
		wait(3000);
		System.out.println("There are still 10 levels to go, however! Clear the rest of the 10th floor and you'll be one step closer to getting back you precious cellphone!");
		wait(3000);
		System.out.println("Good luck; you'll need it.");
		wait(3000);
		System.out.println("To be continued.....");
	
		return;

    }

	public static void wait(int ms){
		try {
	    	Thread.sleep(ms);
		} catch (Exception e) {};
	}

	private static void clearScreen() {
		System.out.print("\033\143");
	}
}
