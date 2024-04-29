package enemies;

import static helpz.Constants.Enemies.RABBIT;

import managers.EnemyManager;

public class Rabbit extends Enemy {

	public Rabbit(float x, float y, int ID, EnemyManager em) {
		super(x, y, ID, RABBIT,em);
		
	}

}
