package views;

import java.awt.Button;

import utils.Constants;

public class GDashboard extends GContainer {

	protected Button backBtn;

	public GDashboard(GView parent) {
		super(parent);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		this.backBtn = new Button(Constants.BACK_BTN_TEXT);
		this.backBtn.addActionListener(this.parent.controller);
	}

	@Override
	public void render() {
		
	}
}
