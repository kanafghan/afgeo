package views;

import java.awt.Panel;

public abstract class GContainer extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected GView parent;
	
	public GContainer(GView parent) {
		this.parent = parent;
		this.init();
		this.render();
	}
	
	public abstract void init();

	public abstract void render();

	//TODO to be implemented (implement the back button)
	// move the implementation to a subclass GDashboard
}
