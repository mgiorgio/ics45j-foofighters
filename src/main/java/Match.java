public class Match {
	public static void main(String[] args) throws InterruptedException {
		FightController fighter = new FightController(new Attacker(),
				new Defender());

		while (fighter.areFightersAlive()) {
			Thread.sleep(500);

			fighter.turn();
		}
		System.out.println(fighter.getWinner() + " won.");
	}
}
