package views;

import java.awt.Panel;
import java.util.ArrayList;
import java.util.List;

import controllers.GController;

import main.Game;

public abstract class GView extends Panel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Game game;
	protected List<GContainer> containers;
	protected GController controller;
	
	public GView(Game game) {
		this.game = game;
		this.containers = new ArrayList<GContainer>();
		this.init();
		this.render();
	}

	public abstract void init();
	
	public abstract void render();
}
