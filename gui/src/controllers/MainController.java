package controllers;

import java.awt.Button;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import utils.Constants;

import containers.MapContainer;

import main.Game;

public class MainController implements ActionListener {

	Game game;

	public MainController(Game game) {
		this.game = game;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		this.game.clear();
		Object source = ae.getSource();
		if (source instanceof Button) {
			Button btn = (Button) source;
			if (btn.getLabel() == Constants.MPWC_BTN_TEXT) {
				this.game.renderMPWC();
				System.out.println("MPWC was clicked!");
			} else if (btn.getLabel() == Constants.FP_BTN_TEXT) {
				this.game.renderFP();
				System.out.println("FP was clicked");
			} else if (btn.getLabel() == Constants.ABOUT_BTN_TEXT) {
				this.game.renderAbout();
				System.out.println("about was clicked");
			}
		}
	}

}
