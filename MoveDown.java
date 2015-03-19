
import java.io.Serializable;

public class MoveDown implements Command, Serializable{
	Player p;

	public MoveDown(Player p){
		this.p = p;
	}
	
	public void execute(){
		p.move(Character.Movement.DOWN.getCode());
	}

}