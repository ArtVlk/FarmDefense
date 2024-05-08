package main;

public enum GameStates {

	PLAYING, MENU, SETTINGS, EDIT, GAME_OVER, GAME_WIN, LANGUAGE;

	public static GameStates gameState = MENU;

	public static void SetGameState(GameStates state) {
		gameState = state;
	}

}
