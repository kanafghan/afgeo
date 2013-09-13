package main;

import java.awt.Button;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			if (btn.getLabel() == "Match Provinces with Capitals") {
				this.game.renderMPWC();
				
				System.out.println("MPWC was clicked!");

			} else if (btn.getLabel() == "Find Provinces") {
				this.game.renderFP();
				@SuppressWarnings("unused")
				Panel mapPanel = new MapContainer();
				System.out.println("FP was clicked");

			} else if (btn.getLabel() == "About") {
				this.game.renderAbout();
				System.out.println("about was clicked");

			}
		}
	}

}
