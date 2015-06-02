
public class Attacker extends AbstractFighter {

	public Attacker() {
		super(getRandom(50) + 49);
	}
	
	@Override
	public String toString() {
		return "Attacker";
	}
}
