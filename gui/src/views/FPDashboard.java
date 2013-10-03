package views;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import utils.Constants;

public class FPDashboard extends GDashboard {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FPStatusbar statusbar;
	private FPQuestion question;

	public FPDashboard(GView parent) {
		super(parent);
	}
	
	@Override
	public void init() {
		super.init();
		this.statusbar = new FPStatusbar(this);
		this.question = new FPQuestion(this);
	}	

	/* (non-Javadoc)
	 * @see views.GContainer#render()
	 */
	@Override
	public void render() {
		super.render();
		BorderLayout layout = new BorderLayout();
		layout.setVgap(15);
		int w = (int) (Constants.WIN_WIDTH * 0.30);
		this.setPreferredSize(new Dimension(w, Constants.WIN_HEIGHT));
		
		this.add(new Button("Start the Game"), BorderLayout.CENTER);
		
		this.add(this.backBtn, BorderLayout.SOUTH);
		
//		this.add(statusbar, BorderLayout.NORTH);
//		this.add(question, BorderLayout.CENTER);
//		
//		// Create the container for the menu
//		Panel menuContainer = new Panel();
//		menuContainer.setLayout(new FlowLayout(FlowLayout.CENTER));
//		this.add(menuContainer, BorderLayout.SOUTH);
//		// Create back button to send the user back to main window
//		Button backBtn = new Button("Back");
//		menuContainer.add(backBtn);
	}
}
