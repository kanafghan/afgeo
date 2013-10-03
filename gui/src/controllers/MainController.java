package controllers;

import java.awt.Button;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import utils.Constants;
import views.AFGMap;


import main.Game;

public class MainController extends GController {

	public MainController(Game game) {
		super(game);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		super.actionPerformed(ae);
		Object source = ae.getSource();
		if (source instanceof Button) {
			Button btn = (Button) source;
			if (btn.getLabel() == Constants.MPWC_BTN_TEXT) {
				this.game.clear();
				this.game.renderMPWC();
				System.out.println("MPWC was clicked!");
			} else if (btn.getLabel() == Constants.FP_BTN_TEXT) {
				this.game.clear();
				this.game.renderFPView();
				System.out.println("FP was clicked");
			} else if (btn.getLabel() == Constants.ABOUT_BTN_TEXT) {
				this.game.clear();
				this.game.renderAbout();
				System.out.println("about was clicked");
			}
		}
	}

}
