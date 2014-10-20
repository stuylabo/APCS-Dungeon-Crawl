import java.util.*;

public abstract class Basechar {

	private int HP, PE, Atk, Def, MAtk, MDef, Stamina, Const, Lv, sight, range;
        private double accuracy;
	private String name;
   
	private Weapon wielded = new Weapon();
	private Weapon quivered = new Weapon();
	private Armor wearing = new Armor();
   

	public Basechar(String charName) {
		name = charName;
		HP = 15;
		PE = 15;
		Atk = 10;
		Def = 10;
		MAtk = 10;
		MDef = 10;
		Stamina = 15; // How much weight can one carry
		Const = 15; // How fast one heals oneself
		Lv = 1;
		sight = 3; // How far can one see
		range = 1; // Will later be written as a function of weapon
		accuracy = 0.6;
	}

	public Basechar() {
		name = "Kevin";
		HP = 15;
		PE = 15;
		Atk = 10;
		Def = 10;
		MAtk = 10;
		MDef = 10;
		Stamina = 15; // How much weight can one carry
		Const = 15; // How fast one heals oneself
		Lv = 1;
		sight = 3; // How far can one see
		range = 1; // Will later be written as a function of weapon
		accuracy = 0.6;
	}
	
	public String getWielded() {
		return wielded.getID();
	}
	
	public String getQuivered() {
		return quivered.getID();
	}
	
	public String getWearing() {
		return wearing.getID();
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int newHP) {
		HP = newHP;
	}
        public int getPE(){
  	        return PE;
        }

	public void setPE(int newPE) {
		PE = newPE;
	}

        public int getAtk(boolean yesRange){ // yesRange true adds quivered attack, otherwise add weilded attack
        	if (yesRange) {
        		return Atk + quivered.extraAtk(); // quivered weapon adds ranged attack!!
        	}
	        else {
	        	return Atk + wielded.extraAtk(); // wielded weapon adds attack!!
	        }
        }

	public void setAtk(int newAtk) {
		Atk = newAtk;
	}

        public int getDef(){
	        return Def + wearing.extraDef(); // Armor adds defense!!
        }

	public void setDef(int newDef) {
		Def = newDef;
	}

	public void setMAtk(int newMAtk) {
		MAtk = newMAtk;
	}

	public void setMDef(int newMDef) {
		MDef = newMDef;
	}

	public void setStamina(int newStamina) {
		Stamina = newStamina;
	}

	public void setConst(int newConst) {
		Const = newConst;
	}

	// Added a getLv to use in MageEncounter

	public int getLv(){
		return Lv;
	}

	public void setLv(int newLv) {
		Lv = newLv;
	}

	public void setSight(int newSight) {
		sight = newSight;
	}

	public void setRange(int newRange) {
		range = newRange;
	}

        public double getAccuracy(){
   	        return accuracy;
        }

	public void setAccuracy(int newAccuracy) {
		accuracy = newAccuracy;
	}

	public abstract void attack (Basechar other);
	
	public void die() {
		System.out.println("GG YOU DIE!");
		
		String yeshno = "";

		while (yeshno.equals("y") ||  yeshno.equals("n")) {
			System.out.println("Do you want to see your stats? ");
			
			Scanner sc = new Scanner(System.in);

			yeshno = sc.nextLine();
		}

		if (yeshno.equals("y")) {
			System.out.println(name);
			System.out.println(name);
			System.out.println(name);
			System.out.println(name);
			System.out.println(name);
			System.out.println(name);
			System.out.println(name);
			System.out.println(name);
			System.out.println(name);
			v
			System.out.println(name);
			System.out.println(name);
			System.out.println(name);
			System.out.println(name);
			System.out.println(name);
			vSystem.out.println(name);
		}

		else {
			System.out.println("okay see ya!");
		}
	}
}
