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
    
    public double getIntimidation(){
    	return intimidation;
    }
    
    public void setIntimidation(double NewIntimidation){
    	intimidation = NewIntimidation;
    }

    public void lecture(Basechar other){
	Random chanceToHit = new Random();
	Random IntFactor = new Random();
	intd = this.getIntimidation;
	if (chanceToHit.nextDouble() < this.getAccuracy()){
	    other.setHP(other.getHP() - (this.getAtk(false) - (other.getDef() / 2)));
	    this.setIntimidation(intd + ((Math.abs(Intfactor - intd)) / 2));
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
}
