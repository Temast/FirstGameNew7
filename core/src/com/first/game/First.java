package com.first.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.screens.GameScreen;


public class First extends Game {
	@Override
	public void create() {
		Gdx.app.log("ZBGame", "created");
		setScreen(new GameScreen());
	}
}
