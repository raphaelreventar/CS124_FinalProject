//Concrete Accessory Item
import java.io.Serializable;

public class StaminaHat implements Item, Serializable {
	public String getName () {
		return "Stamina Hat (Accessory)";
	}
	public boolean isWeapon () {
		return false;
	}
	public boolean isArmor () {
		return false;
	}
	public boolean isAccessory () {
		return true;
	}
	public void use (Character c) {
		c.vx += 2;
		c.vy += 2;
	}
	public void remove (Character c) {
		c.vx -= 2;
		c.vy -= 2;
	}
	public void activate (Character c) {}
}