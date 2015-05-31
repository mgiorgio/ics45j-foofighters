public class FightController {

	private Fighter player1, player2;

	public FightController(Fighter player1, Fighter player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public boolean areFightersAlive() {
		return player1.isStillAlive() && player2.isStillAlive();
	}

	public Fighter getWinner() {
		if (player1.isStillAlive()) {
			return player1;
		} else if (player2.isStillAlive()) {
			return player2;
		} else {
			return null;
		}
	}

	public void turn() {
		System.out.println("Player 1 attacks!");
		computeAttack(player1, player2);
		System.out.println("Energy: " + player1.energy() + ":"
				+ player2.energy());

		System.out.println("Player 2 attacks!");
		computeAttack(player2, player1);
		System.out.println("Energy: " + player1.energy() + ":"
				+ player2.energy());
	}

	private void computeAttack(Fighter attacker, Fighter defender) {
		int attackingPoints = attacker.attack();
		int defensivePoints = defender.defense();

		int damage = calculateDamage(attackingPoints, defensivePoints);
		defender.damage(damage);
	}

	private int calculateDamage(int attackingPoints, int defensivePoints) {
		return (int) 10 * (attackingPoints / defensivePoints);
	}
}