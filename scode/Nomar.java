import java.util.*;

public class Nomar extends Basechar{
    private String name;
    private int sight, HP, level;             
    private double intimidation;

    public Nomar(){
	super();
	name = "The Great Nomar";
	level = super.getLv() + 5;
	intimidation = 0.5;
	HP = super.getHP() + 10;
    }
    
    public Nomar(String name){
    	super(name);
    	intimidation = 0.1;
    }
    
    public double getIntimidation(){
    	return intimidation;
    }
    
    public void setIntimidation(double NewIntimidation){
    	intimidation = NewIntimidation;
    }
    
    public static void wait(int ms){
    	try {
    		Thread.sleep(ms);
    	} catch (Exception e) {}
    }

    public void lecture(Basechar other){
	Random chanceToHit = new Random();
	Random IntFactor = new Random();
	intd = this.getIntimidation;
	if (chanceToHit.nextDouble() < this.getAccuracy()){
	    System.out.println(this + " gives you a lengthy lecture!");
            wait(1000);
	    other.setHP(other.getHP() - (this.getAtk(false) - (other.getDef() / 2)));
	    this.setIntimidation(intd + ((Math.abs(Intfactor.nextDouble() - intd)) * 0.5));
	    }
	else{
 	    System.out.println(this + " tries to lecture you but you can't hear him over your blasting headphones.");
	}
    }
    
    public void instaKill(Basechar other){
        Random chanceToHit = new Random();
        if (chanceToHit.nextDouble() < (this.getAccuracy() * 0.3)){
        	System.out.println(this + " calls your parents!!!");
        	wait(1000);
        	other.setHP(0);
        }
        else{
        	System.out.println(this + " calls your parents but no one answers.");
        	wait(1000);
        }
    
    }
    
    public void confiscation(Basechar other){
    	Random chanceToHit = new Random();
    	if (chanceToHit.nextDouble() < (this.getAccuracy()) {
    		if (other.getWielded().equals("Bare Hands"){
    			System.out.println(this + " uses confiscation!");
    			wait(2000);
    			System.out.println("...but you had nothing on you.");
    		}
    		else{
    		        System.out.println(this + " confiscates your " + other.getWielded() + "!");
    		        wait(1000);
    		        System.out.println("Nooo!!! That was your last " + other.getWielded() + "!");
    		        other.setWielded("Bare Hands");	
    		}
    		
    	}
    }
}

  

	
