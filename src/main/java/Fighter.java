public interface Fighter {

	public static final int POINTS = 100;

	public static final int ENERGY = 500;

	public int attack();

	public int defense();

	public void damage(int damage);

	public boolean isStillAlive();

	public int energy();
}
