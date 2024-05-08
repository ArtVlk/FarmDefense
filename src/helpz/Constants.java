package helpz;

import language.Translator;
public class Constants {
	public static Translator lanButton = new Translator();

	public static class Projectiles {
		public static final int ARROW = 0;
		public static final int CHAINS = 1;
		public static final int BOMB = 2;

		public static float GetSpeed(int type) {
			switch (type) {
			case ARROW:
				return 8f;
			case BOMB:
				return 4f;
			case CHAINS:
				return 6f;
			}
			return 0f;
		}
	}

	public static class Towers {
		public static final int LAMA = 0;
		public static final int DOG = 1;
		public static final int COW = 2;

		public static int GetTowerCost(int towerType) {
			switch (towerType) {
			case LAMA:
				return 65;
			case DOG:
				return 35;
			case COW:
				return 50;
			}
			return 0;
		}

		public static String GetName(int towerType) {
			switch (towerType) {
			case LAMA:
				return lanButton.getLama();
			case DOG:
				return lanButton.getDog();
			case COW:
				return lanButton.getCow();
			}
			return "";
		}

		public static int GetStartDmg(int towerType) {
			switch (towerType) {
			case LAMA:
				return 15;
			case DOG:
				return 500;
			case COW:
				return 0;
			}

			return 0;
		}

		public static float GetDefaultRange(int towerType) {
			switch (towerType) {
			case LAMA:
				return 75;
			case DOG:
				return 120;
			case COW:
				return 100;
			}

			return 0;
		}

		public static float GetDefaultCooldown(int towerType) {
			switch (towerType) {
			case LAMA:
				return 120;
			case DOG:
				return 35;
			case COW:
				return 50;
			}

			return 0;
		}
	}

	public static class Direction {
		public static final int LEFT = 0;
		public static final int UP = 1;
		public static final int RIGHT = 2;
		public static final int DOWN = 3;
	}

	public static class Enemies {

		public static final int TARAS = 0;
		public static final int RABBIT = 1;
		public static final int NAPOLEON = 2;
		public static final int CAT = 3;

		public static int GetReward(int enemyType) {
			switch (enemyType) {
			case TARAS:
				return 5;
			case RABBIT:
				return 5;
			case NAPOLEON:
				return 25;
			case CAT:
				return 10;
			}
			return 0;
		}

		public static float GetSpeed(int enemyType) {
			switch (enemyType) {
			case TARAS:
				return 0.5f;
			case RABBIT:
				return 0.7f;
			case NAPOLEON:
				return 0.45f;
			case CAT:
				return 0.85f;
			}
			return 0;
		}

		public static int GetStartHealth(int enemyType) {
			switch (enemyType) {
			case TARAS:
				return 85;
			case RABBIT:
				return 100;
			case NAPOLEON:
				return 400;
			case CAT:
				return 125;
			}
			return 0;
		}
	}

	public static class Tiles {
		public static final int WATER_TILE = 0;
		public static final int GRASS_TILE = 1;
		public static final int ROAD_TILE = 2;
	}

}
