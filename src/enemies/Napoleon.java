package enemies;

import static helpz.Constants.Enemies.NAPOLEON;

import managers.EnemyManager;

public class Napoleon extends Enemy {

	public Napoleon(float x, float y, int ID, EnemyManager em) {
		super(x, y, ID, NAPOLEON,em);
		
	}

}
