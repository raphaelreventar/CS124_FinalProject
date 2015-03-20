//Concrete Armor Item
import java.io.Serializable;

public class Shield implements Item, Serializable {
	public String getName () {
		return "Shield (Armor)";
	}
	public boolean isWeapon () {
		return false;
	}
	public boolean isArmor () {
		return true;
	}
	public boolean isAccessory () {
		return false;
	}
	public void use (Character c) {
		c.def += 3;
		c.def += 3;
	}
	public void remove (Character c) {
		c.def -= 3;
		c.def -= 3;
	}
	public void activate (Character c) {}
}