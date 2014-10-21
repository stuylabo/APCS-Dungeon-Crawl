import java.util.*;

public class Nomar extends Basechar{
    private String name;
    private int sight, HP, level, Atk;             
    private double intimidation;

    public Nomar(){
	super();
	name = "The Great Nomar";
	level = super.getLv() + 5;
	intimidation = 0.5;
	HP = super.getHP() + 10;
    }

    public String getName(){
	return name;
    }

    public String toString(){
	return getName();
    }

    public void lecture(Basechar other){
	Random chanceToHit = new Random();
	if (chanceToHit.nextDouble() < this.getAccuracy()){
	    other.setHP(other.getHP() - Atk / 2);
	    other.setAtk(other.getAtk() - 2);
	    other.setDef(other.getDef() - 2);
	    }
    }
    
    public void instaKill(Basechar other){
        Random chanceToHit = new Random();
        if (chanceToHit.nextDouble() < (this.getAccuracy()/2){
        	other.setHP(0);
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
		    System.out.println(this + " becomes enraged");
		}
		else {
		    //some kind of special attack
		}
		Random a = new Random();
		Double b = a.nextDouble();
		if (b > 0.5){
		    this.BaseAttack(other);
		    System.out.println("You are attacked by " + this);
		}
		else{
		    this.lecture(other);
		    System.out.println("You are lectured by " + this);
		}

	    }
	}
    }
}
