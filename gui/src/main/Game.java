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
import java.util.ArrayList;
import java.util.List;

import utils.Constants;
import views.AFGMap;
import views.FPView;
import views.GView;
import views.MainView;

import controllers.MainController;

public class Game extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6141621755202594625L;
	
	private List<GView> views;

	public void init() {
		this.setSize(new Dimension(Constants.WIN_WIDTH, Constants.WIN_HEIGHT));
		
		this.views = new ArrayList<GView>();
		this.views.add(Constants.MAIN_VIEW_POS, new MainView(this));
		this.views.add(Constants.FP_VIEW_POS, new FPView(this));

		this.renderMainView();
	}

	private void renderMainView() {
		this.setLayout(new BorderLayout());	
		this.add(this.views.get(Constants.MAIN_VIEW_POS), BorderLayout.CENTER);
		this.validate();
	}

	public void clear() {
		this.removeAll();
		this.invalidate();
	}

	public void renderMPWC() {
		//TODO to be implemented
	}

	public void renderFPView() {
		this.setLayout(new BorderLayout());	
		this.add(this.views.get(Constants.FP_VIEW_POS), BorderLayout.CENTER);
		this.validate();
	}

	public void renderAbout() {
		//TODO to be implemented 
	}
}
