package main;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import utils.Constants;

import containers.MapContainer;
import controllers.MainController;

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

	private MapContainer mapContainer;

	public void init() {
		this.setSize(new Dimension(Constants.WIN_WIDTH, Constants.WIN_HEIGHT));
		this.mainController = new MainController(this);
		this.mapContainer = new MapContainer(this);

		this.renderMainWindow();
	}

	private void renderMainWindow() {
		setLayout(new GridLayout(1, 3));

		blackPanel = new Panel();
		blackPanel.setBackground(new Color(0, 0, 0));
		blackPanel.setLayout(new GridLayout(3, 1));
		add(blackPanel);
		findProvincesBtn = new Button(Constants.FP_BTN_TEXT);
		findProvincesBtn.setBounds(20, 20, 100, 30);
		blackPanel.add(findProvincesBtn);
		findProvincesBtn.addActionListener(this.mainController);

		redPanel = new Panel();
		redPanel.setBackground(new Color(240, 25, 10));
		redPanel.setLayout(new GridLayout(3, 1));
		add(redPanel);
		Button matchProvincesBtn = new Button(Constants.MPWC_BTN_TEXT);
		matchProvincesBtn.setBounds(20, 70, 100, 40);
		redPanel.add(matchProvincesBtn);
		matchProvincesBtn.addActionListener(this.mainController);

		greenPanel = new Panel();
		greenPanel.setBackground(new Color(2, 220, 30));
		greenPanel.setLayout(new GridLayout(3, 1));
		add(greenPanel);
		Button about = new Button(Constants.ABOUT_BTN_TEXT);
		about.setBounds(20, 100, 110, 60);
		greenPanel.add(about);
		about.addActionListener(this.mainController);
		
		//this.validate();
	}

	public void clear() {
		this.removeAll();
		this.invalidate();
	}

	public void renderMPWC() {
		//TODO to be implemented
	}

	public void renderFP() {
		setLayout(new BorderLayout());
		
		Panel dashboard = new Panel();
		GridLayout layout = new GridLayout(3, 1);
		layout.setVgap(5);
		dashboard.setLayout(layout);
		int w = (int) (Constants.WIN_WIDTH * 0.30);
		dashboard.setPreferredSize(new Dimension(w, Constants.WIN_HEIGHT));
		
		// Create the container for player points
		Panel pointsContainer = new Panel();
		pointsContainer.setLayout(new FlowLayout(FlowLayout.CENTER, 8, 8));
		dashboard.add(pointsContainer);
		// Create the 'Points' Label
		Label points = new Label("Points:");
		pointsContainer.add(points);
		// Create the label for points
		Label pointValue = new Label("0", Label.CENTER);
		pointsContainer.add(pointValue);
		
		// Create the container for question
		Panel questionContainer = new Panel();
		questionContainer.setLayout(new FlowLayout(FlowLayout.CENTER));
		dashboard.add(questionContainer);
		// The question?
		Label question = new Label("Which province is highlighted on the map?");
		question.setPreferredSize(new Dimension(w, 60));
		questionContainer.add(question);
		for (int i=0; i<4; i++) {
			questionContainer.add(new Button("Answer "+ (i+1)));
		}
		
		// Create the container for the menu
		Panel menuContainer = new Panel();
		menuContainer.setLayout(new FlowLayout(FlowLayout.CENTER));
		dashboard.add(menuContainer);
		// Create back button to send the user back to main window
		Button backBtn = new Button("Back");
		menuContainer.add(backBtn);
		
		add(this.mapContainer, BorderLayout.CENTER);
		add(dashboard, BorderLayout.EAST);
		this.validate();
	}

	public void renderAbout() {
		//TODO to be implemented 
	}
}
