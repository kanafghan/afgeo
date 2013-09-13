package main;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;

public class Game extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6141621755202594625L;

	MainController mainController;
	Panel redPanel;
	Panel blackPanel;
	Panel greenPanel;
	Button matchProvincesBtn;
	private Button findProvincesBtn;

	public void init() {
		this.setSize(new Dimension(700, 400));
		this.mainController = new MainController(this);

		this.renderMainWindow(this.mainController);
	}

	private void renderMainWindow(ActionListener controller) {
		setLayout(new GridLayout(1, 3));

		blackPanel = new Panel();
		blackPanel.setBackground(new Color(0, 0, 0));
		blackPanel.setLayout(new GridLayout(3, 1));
		add(blackPanel);
		findProvincesBtn = new Button("Find Provinces");
		findProvincesBtn.setBounds(20, 20, 100, 30);
		blackPanel.add(findProvincesBtn);
		findProvincesBtn.addActionListener(controller);

		redPanel = new Panel();
		redPanel.setBackground(new Color(240, 25, 10));
		redPanel.setLayout(new GridLayout(3, 1));
		add(redPanel);
		Button matchProvincesBtn = new Button("Match Provinces with Capitals");
		matchProvincesBtn.setBounds(20, 70, 100, 40);
		redPanel.add(matchProvincesBtn);
		matchProvincesBtn.addActionListener(controller);

		greenPanel = new Panel();
		greenPanel.setBackground(new Color(2, 220, 30));
		greenPanel.setLayout(new GridLayout(3, 1));
		add(greenPanel);
		Button about = new Button("About");
		about.setBounds(20, 100, 110, 60);
		greenPanel.add(about);
		about.addActionListener(controller);
	}

	public void clear() {
		this.removeAll();
	}

	public void renderMPWC() {
		// TODO Auto-generated method stub

	}

	public void renderFP() {
		add(new MapContainer());

	}

	public void renderAbout() {
		// TODO Auto-generated method stub

	}
}
