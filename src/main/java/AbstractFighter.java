import java.util.Random;

public class AbstractFighter implements Fighter {

	private int attackPoints;

	private int defensePoints;

	private int energy;

	private static Random random = new Random();

	public AbstractFighter(int attackPoints) {
		energy = ENERGY;
		this.attackPoints = attackPoints;
		this.defensePoints = Fighter.POINTS - attackPoints;
	}

	@Override
	public int attack() {
		return getRandom(attackPoints) + 1;
	}

	protected static int getRandom(int number) {
		return random.nextInt(number) + 1;
	}

	@Override
	public int defense() {
		return getRandom(defensePoints);
	}

	@Override
	public void damage(int damage) {
		energy -= damage;
	}

	@Override
	public boolean isStillAlive() {
		return energy > 0;
	}

	@Override
	public int energy() {
		return energy;
	}
}