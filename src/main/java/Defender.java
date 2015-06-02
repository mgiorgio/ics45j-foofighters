public class Defender extends AbstractFighter {

	public Defender() {
		super(getRandom(49) + 1);
	}

	@Override
	public String toString() {
		return "Defender";
	}
}
