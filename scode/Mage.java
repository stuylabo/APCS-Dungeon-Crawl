import java.util.*;

public class Mage extends Basechar{
    
    private int PwrBoost, MAtkBoost, sightboost, Pwr;
    private String name;
    // Don't know how to make lists yet so we might have to do a separate variable for each spell
    private String spells = "Energy Bolt";
    private String EnergyBoltInfo = "Base MATK: 5 \n Pwr Cost: 5";
    
    public Mage(){
	super();
    }

    public Mage(String name){
        super(name);
	Pwr = super.getPwr() +  PwrBoost;
    }
   
    public String MageEncounter(Basechar other) {
    	
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
   
}
		    
	    
