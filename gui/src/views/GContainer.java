package views;

import java.awt.Panel;

public class GContainer extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected GView parent;
	
	public GContainer(GView parent) {
		this.parent = parent;
		this.render();
	}

	public void render() {
		
	}

	//TODO to be implemented (implement the back button)
}
