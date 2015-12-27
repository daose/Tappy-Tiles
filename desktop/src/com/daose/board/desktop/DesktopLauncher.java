package com.daose.board.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.daose.board.Board;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        config.width = Board.WIDTH;
        config.height = Board.HEIGHT;
        config.title = Board.TITLE;

		new LwjglApplication(new Board(), config);
	}
}
