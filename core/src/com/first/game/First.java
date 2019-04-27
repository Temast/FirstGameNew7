package com.first.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.helpers.AssetLoader;
import com.screens.GameScreen;
import com.screens.SplashScreen;


public class First extends Game {
	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
}
