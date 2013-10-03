package controllers;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import utils.Constants;

import main.Game;

public abstract class GController implements ActionListener {

	protected Game game;

	public GController(Game game) {
		this.game = game;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		Object source = ae.getSource();
		if (source instanceof Button) {
			Button btn = (Button) source;
			if (btn.getLabel() == Constants.BACK_BTN_TEXT) {
				System.out.println("Back button clicked!");
				game.clear();
				game.renderMainView();
			}
		}
		System.out.println("Action Performed!");

	}

}
