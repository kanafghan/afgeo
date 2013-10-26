package controllers;

import java.awt.event.ActionEvent;

import main.Game;

public class FPController extends GController {
	Game dashboard = null;

	public FPController(Game game) {
		super(game);
		dashboard.startGame();
	}

	public void actionPerformed(ActionEvent ae) {
		super.actionPerformed(ae);
		
	}

}
