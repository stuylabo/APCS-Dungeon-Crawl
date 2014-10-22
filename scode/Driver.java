import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	System.out.println("Welcome to STUYABLO!");
	wait(1000);
	System.out.println("Choose your class:");
	wait(1000);
        System.out.println("0) Akholyte or 1) Warrior");
	wait(1000);
	
	Scanner sc = new Scanner(System.in);
	String choice;
	choice = sc.nextLine();
	if(choice.equals(0)){
	    System.out.println("Good choice!");
	}
	else{
	    System.out.println("You're a Stuy student. Really?\nYou're an Akhloyte.");
	}
	wait(1000);

	System.out.println("What is your name?");
	String name;
	name = sc.nextLine();
	Akholyte a = new Akhloyte(name);
	wait(1000);

	System.out.println("You are finally ready to play STUYABLO!");  
	wait(1000);
	System.out.println("You are on the 10th floor of Sayvetstun. The evil overlord Nomar has confiscated your cellphone! Get it back from him!");
	wait(1000);
	System.out.println("You must make your way to the 1st floor to find Nomar and defeat him!");
	wait(1000);
	System.out.println("Oh look, one of Nomar's grunts is standing in your way. Defeat him to move forward!");
	wait(1000);

	System.out.println("dramatic music plays");
	wait(3000);

	Nomar n = new Nomar("Nomar Grunt");
	a.attack(n);
	
        /*
	  Should exp gain and leveling up be handled in the attack method? 
	  If not, how should we handle that? Create a method called "checklevel" in Basechar
	  and use it to level up the character if they hit a new level?
	  I really don't think that should be in the driver.
	  So like after a.attack(n) resolves we should call a.checklevel(n)?
	*/

	System.out.println("Good job! You defeated the Nomar Grunt!");
	wait(1000);
	System.out.println("There are still 10 levels to go, however! Clear the rest of the 10th floor and you'll be one step closer to getting back you precious cellphone!");
	wait(3000);
	System.out.println("Good luck; you'll need it.");
	wait(3000);
	System.out.println("To be continued.....");
	

    }

    public static void wait(int ms){
	try {
	    Thread.sleep(ms);
	} catch (Exception e) {};
    }


























	/*public String MageEncounter(Basechar other) {
    	
	    int confirmation = 0;
    	
	    while (! (confirmation == 1 || confirmation == 2)) {
		System.out.println("Do you want to 1) FIGHT or 2) RUN ?");

		Scanner sc = new Scanner(System.in);
		confirmation = sc.nextInt();
	    }
    	
	    if (confirmation == 2){
		Random chanceToRun = new Random();
		double runChance = 0.5 - ( ( other.getLv() - this.getLv() ) / 10.00 );
		if (chanceToRun.nextDouble() >=  runChance) {
		    String end = "You successfully ran away!";
		    return end;
		}
		else {
		    String end = "You have failed to run away!";
		    System.out.println(end);
		}
	    }
	    System.out.println("You have entered a fight with " + other);
	    while ( (this.getHP() > 0) && (other.getHP() > 0 ) ) {
		System.out.println("Do you want to attack with 1) Basic ATK or 2) a SPELL?");
		int attack;
		Scanner scatk = new Scanner(System.in);
		attack = scatk.nextInt();
		if ( attack == 2 ) {
		    System.out.println("Type your spell: " + spells);
		    String atkspell = "";
		    Scanner scspell = new Scanner(System.in);
		    atkspell = scspell.nextLine();
		    if (atkspell.equals("Energy Bolt")) {
			System.out.println(EnergyBoltInfo);
			System.out.println("Attack? y or n");
			String atkconfirm = "";
			Scanner atkconf = new Scanner(System.in);
			atkconfirm = atkconf.nextLine();
		    }
		}
	    }
	}
	public void NomarEncounter(Basechar other){
	    String encounter = "";  
	    while (encounter != "over"){
		if (other.getHP() <= 0){
		    other.die();
		    encounter = "over";
		}
		else if (this.HP <= 0){
		    System.out.println(this + " has been vanquished");
		    encounter = "over";
		}
		System.out.println("1) Attempt to fight\n2) Run away like a coward");
	    
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
	    
		if (choice.equals("2")){
		    Random r = new Random();
		    double courage = r.nextDouble();
		    if (courage >= intimidation){
			System.out.println("You managed to run away from " + this);
			encounter = "over";
		    }
		    else{
			System.out.println("You are frozen in fear and cannot run away from " + this);
		    }
		}
	    
		else if (choice.equals("1")){
		    System.out.println("1) Attack\n2) Special Attack");
		    Scanner attack = new Scanner(System.in);
		    String scanAtk = attack.nextLine();
	        
		    if (scanAtk.equals("1")){
			other.BaseAttack(this);
			System.out.println("You attack " + this);
		    }
		
		    else {
			//some kind of special attack
		    }
		
		    Random a = new Random();
		    Double b = a.nextDouble();
		
		    if (b > 0.5){
			this.instaKill(other);
			System.out.println(this + " calls your parents");
		    
			try{
			    Thread.sleep(2000);
			} catch (Exception e) {}
		    
			System.out.println("You die instantly");
		    }
		
		    else{
			this.lecture(other);
			System.out.println("You are lectured by " + this);
		    }

		}
	    }
	}
	*/
    
}
