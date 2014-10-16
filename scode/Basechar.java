public class Basechar {

	private int HP, Pwr, Atk, Def, MAtk, MDef, Stamina, Const, Lv, sight, range, accuracy;
	private String name;

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

	public void BaseAttack (Basechar other) {
		Random chanceToHit = new Random();

		if (chanceToHit.nextFloat() < accuracy) {
			other.HP = other.HP - Atk;
		}
	}

	public void updateStats() {
		// Update stat when levelled
	}

	public void die() {
		System.out.println("GG YOU DIE!");
		
		String yeshno = "";

		while (yeshno.equals("y") or yeshno.equals("n")) {
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
