import java.util.*;

public class Akholyte extends Basechar{
    
    private int PEBoost = 5;
    private int MAtkBoost = 3;
    private String name;
    // Don't know how to make lists yet so we might have to do a separate variable for each spell
    //private String spells = "Energy Bolt";
    private int EnergyBoltDMG = 5;
    private int EnergyBoltCOST = 5;
    private String EnergyBoltInfo = "Base MATK: " + EnergyBoltDMG + " \n Pwr Cost: " + EnergyBoltCOST;
    private String Weapons = "Bare Hands, Regents Physics Textbook, Wand";
    private String[] parts = Weapons.split(",");

    public Akholyte() {
		super("Kevin", "Regents Physics Textbook", "Wand R", "Body");
    }

    public Akholyte(String name){
        super(name, "Regents Physics Textbook", "Wand R", "Body");
		super.setPE(super.getPE() +  PEBoost);
		super.setMAtk(super.getMAtk() + MAtkBoost);
    }

	public void attack(Basechar other) {
		Scanner sc = new Scanner(System.in);
		String choice = "";

		while (! (choice.equals("1") || choice.equals("2"))) {
			System.out.println("Do you want to use:");
			System.out.println("1. Melee attack with " + this.getWielded());
			System.out.println("2. Ranged attack with " + this.getQuivered());
			choice = sc.nextLine();
		}

		if (choice.equals("1")) {
			if (this.toHit(1)) {
				int damage = this.getAtk(false) - (other.getDef() / 2);
				other.setHP(other.getHP() - damage);
				System.out.println("You landed a hit!");
				System.out.println("You inflicted " + damage + " damage!!");
			}

			else {
				System.out.println("You missed!");
			}
		}

		else {
			if (this.toHit(1)) {
				int damage = this.getAtk(true) - (other.getDef() / 2);
				other.setHP(other.getHP() - damage);
				System.out.println("You landed a hit!");
				System.out.println("You inflicted " + damage + " damage!!");
			}

			else {
				System.out.println("You missed!");
			}
		}
	}
   /*
    public abstract void attack(Basechar other) {
    	
	System.out.println("You have entered a fight with " + other);
	while ( (this.getHP() > 0) || (other.getHP() > 0 ) ) {
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
		    other.setHP( other.getHP() - (this.getMAtk() + EnergyBoltDMG - ( 0.5 * other.getMDef() )) );
		    this.setPE( PE - EnergyBoltCOST );
		}
	    }
	    else {
		System.out.println("Choose your weapon: " + Weapons);
		String atkweapon = "";
		while (! ( (atkweapon.equals( parts[0] )) || (atkweapon.equals(parts[1])) ) ) {
		    Scanner scwep = new Scanner(System.in);
		    atkweapon = scwep.nextLine();
		}
		if ( atkweapon.equals( parts[0] )) {
		    this.setWielded( "Regents Physics Textbook" );
		    other.setHP( other.getHP - (this.getAtk(yesRange) - (0.5 * other.getDef() ) )); 
		}
		if ( atkweapon.equals( parts[1] )) {
		    other.

	}
    }
   */
}
		    
	    
