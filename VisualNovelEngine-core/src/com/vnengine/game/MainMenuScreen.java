package com.vnengine.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class MainMenuScreen implements Screen
{
	final VisualNovelEngine game;
	Music music;
	OrthographicCamera camera;
	
	public MainMenuScreen(final VisualNovelEngine g)
	{
		this.game = g;

		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
		//music = Gdx.audio.newMusic(Gdx.files.internal("Kira's Theme.mp3"));
		music = Gdx.audio.newMusic(Gdx.files.internal("Amazing Magician.mp3"));
		//music = Gdx.audio.newMusic(Gdx.files.internal("Shelter (Instrumental).mp3"));
	}
	
	@Override
	public void show() {
		music.play();
		music.setVolume(0.5f);
		music.setLooping(true);
	}

	@Override
	public void render(float delta) {
		
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();
		game.batch.setProjectionMatrix(camera.combined);
		
		game.batch.begin();
		game.font.draw(game.batch, "Welcome to Visual Novel Engine", 300, 240);
		game.batch.end();	
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		music.pause();
		
	}

	@Override
	public void resume() {
		music.play();
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		music.dispose();
	}

}
