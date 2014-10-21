public class Weapon {
  
  private int extraAtk, extraRange;
  private String ID;
  
  public Weapon() {
    extraAtk = 0;
    extraRange = 0;
    ID = "Bare Hands"
  }
  
  public Weapon(String weapID) {
    
    ID = weapID;
    
    if (weapID.equals("Longsword") {
      extraAtk = 5;
      extraRange = 1;
    }
    
    else if (weapID.equals("Bow and Arrow") {
      extraAtk = 2;
      extraRange = 7;
    }
    
    else if (weapID.equals("Wand") {
      extraAtk = 3;
      extraRange = 5;
    }
  }
  
  public String getID() {
    return ID;
  }
}
