package views;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import utils.Constants;

public class FPDashboard extends GContainer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FPDashboard(GView parent) {
		super(parent);
	}

	/* (non-Javadoc)
	 * @see views.GContainer#render()
	 */
	@Override
	public void render() {
		GridLayout layout = new GridLayout(3, 1);
		this.setLayout(layout);
		layout.setVgap(5);
		int w = (int) (Constants.WIN_WIDTH * 0.30);
		this.setPreferredSize(new Dimension(w, Constants.WIN_HEIGHT));
		
		// Create the container for player points
		Panel pointsContainer = new Panel();
		pointsContainer.setLayout(new FlowLayout(FlowLayout.CENTER, 8, 8));
		this.add(pointsContainer);
		// Create the 'Points' Label
		Label points = new Label("Points:");
		pointsContainer.add(points);
		// Create the label for points
		Label pointValue = new Label("0", Label.CENTER);
		pointsContainer.add(pointValue);
		
		// Create the container for question
		Panel questionContainer = new Panel();
		questionContainer.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.add(questionContainer);
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
		this.add(menuContainer);
		// Create back button to send the user back to main window
		Button backBtn = new Button("Back");
		menuContainer.add(backBtn);
	}
}
