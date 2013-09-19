package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.Game;

public abstract class GController implements ActionListener {

	protected Game game;

	public GController(Game game) {
		this.game = game;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
