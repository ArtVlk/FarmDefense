package enemies;

import static helpz.Constants.Enemies.TARAS;

import managers.EnemyManager;

public class Taras extends Enemy {

	public Taras(float x, float y, int ID, EnemyManager em) {
		super(x, y, ID, TARAS,em);
	}

}
