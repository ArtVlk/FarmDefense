package enemies;

import static helpz.Constants.Enemies.CAT;

import managers.EnemyManager;

public class Cat extends Enemy {

	public Cat(float x, float y, int ID, EnemyManager em) {
		super(x, y, ID, CAT, em);
	}

}
