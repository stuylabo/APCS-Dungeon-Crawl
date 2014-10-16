public class Basechar {

	private int HP, Atk, Def, MAtk, MDef, Stamina, Const, Lv, sight, range;
	private String name;

	public Basechar(String charName) {
		name = charName;
		HP = 15;
		Atk = 10;
		Def = 10;
		MAtk = 10;
		MDef = 10;
		Stamina = 15; // How much weight can one carry
		Const = 15; // How fast one heals oneself
		Lv = 1;
		sight = 3; // How far can one see
		range = 1; // Will later be written as a function of weapon
	}

	public Basechar() {
		name = "Kevin";
		HP = 15;
		Atk = 10;
		Def = 10;
		MAtk = 10;
		MDef = 10;
		Stamina = 15; // How much weight can one carry
		Const = 15; // How fast one heals oneself
		Lv = 1;
		sight = 3; // How far can one see
		range = 1; // Will later be written as a function of weapon
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int newHP) {
		HP = newHP;
	}

	public void BaseAttack (Basechar other) {
		Random chanceToHit = new Random();

		if (chanceToHit.nextFloat() < (0.6 + 0.05 * Lv)) {
			other.HP = other.HP - Atk;
		}
	}
}
