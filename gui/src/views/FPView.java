package views;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import controllers.FPController;

import utils.Constants;
import main.Game;

public class FPView extends GView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int MAP_POS = 0;
	private static final int DASHBOARD_POS = 1;

	public FPView(Game game) {
		super(game);
	}

	@Override
	public void init() {
		this.controller = new FPController(game);

		this.containers.add(MAP_POS, new AFGMap(this));
		this.containers.add(DASHBOARD_POS, new FPDashboard(this));
	}

	@Override
	public void render() {		
		this.setLayout(new BorderLayout());
		
		this.add(this.containers.get(MAP_POS), BorderLayout.CENTER);
		this.add(this.containers.get(DASHBOARD_POS), BorderLayout.EAST);
	}
}
