package controllers;

import java.awt.event.ActionEvent;

import main.Game;

public class FPController extends GController {
	Game dashboard;

	public FPController(Game game) {
		super(game);
	}

	public void actionPerformed(ActionEvent ae) {
		super.actionPerformed(ae);
		dashboard.startGame();

	}

}
