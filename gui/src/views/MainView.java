package views;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;

import controllers.MainController;

import utils.Constants;
import main.Game;

public class MainView extends GView {

	private Panel redPanel;
	private Panel blackPanel;
	private Panel greenPanel;
//	private Button matchProvincesBtn;
	private Button findProvincesBtn;
	
	public MainView(Game game) {
		super(game);
	}
	
	@Override
	public void init() {
		this.controller = new MainController(game);
	}	
	
	@Override
	public void render() {
		setLayout(new GridLayout(1, 3));

		blackPanel = new Panel();
		blackPanel.setBackground(new Color(0, 0, 0));
		blackPanel.setLayout(new GridLayout(3, 1));
		add(blackPanel);
		findProvincesBtn = new Button(Constants.FP_BTN_TEXT);
		findProvincesBtn.setBounds(20, 20, 100, 30);
		blackPanel.add(findProvincesBtn);
		findProvincesBtn.addActionListener(this.controller);

		redPanel = new Panel();
		redPanel.setBackground(new Color(240, 25, 10));
		redPanel.setLayout(new GridLayout(3, 1));
		add(redPanel);
		Button matchProvincesBtn = new Button(Constants.MPWC_BTN_TEXT);
		matchProvincesBtn.setBounds(20, 70, 100, 40);
		redPanel.add(matchProvincesBtn);
		matchProvincesBtn.addActionListener(this.controller);

		greenPanel = new Panel();
		greenPanel.setBackground(new Color(2, 220, 30));
		greenPanel.setLayout(new GridLayout(3, 1));
		add(greenPanel);
		Button about = new Button(Constants.ABOUT_BTN_TEXT);
		about.setBounds(20, 100, 110, 60);
		greenPanel.add(about);
		about.addActionListener(this.controller);
	}
}
