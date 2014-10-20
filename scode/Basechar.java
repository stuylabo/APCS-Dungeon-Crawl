import java.util.*;

public class Basechar {

	private int HP, Pwr, Atk, Def, MAtk, MDef, Stamina, Const, Lv, sight, range;
        private double accuracy;
	private String name;
   
	private Weapon wielded = new Weapon();
	private Weapon quivered = new Weapon();
	private Armor wearing = new Armor();
   

	public Basechar(String charName) {
		name = charName;
		HP = 15;
		Pwr = 15;
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
		Pwr = 15;
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

	public int getHP() {
		return HP;
	}

	public void setHP(int newHP) {
		HP = newHP;
	}
        public int getPwr(){
  	        return Pwr;
        }

	public void setPwr(int newPwr) {
		Pwr = newPwr;
	}

        public int getAtk(){
	        return Atk;
        }

	public void setAtk(int newAtk) {
		Atk = newAtk;
	}

        public int getDef(){
	        return Def;
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

	public void BaseAttack (Basechar other) {
		Random chanceToHit = new Random();

		if (chanceToHit.nextFloat() < accuracy) {
			other.HP = other.HP - Atk;
		}
	}

	public void die() {
		System.out.println("GG YOU DIE!");
		
		String yeshno = "";

		while (yeshno.equals("y") ||  yeshno.equals("n")) {
			System.out.println("Do you want to see your stats? ");
			
			Scanner sc = new Scanner(System.in);

			yeshno = sc.nextLine();
		}

		if (yeshno.equals("y")) {
			// Print all stats I guess
		}

		else {
			System.out.println("okay see ya!");
		}
	}
}
