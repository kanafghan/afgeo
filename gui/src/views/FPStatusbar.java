package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class FPStatusbar extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private GContainer parent;
	private int points;
	private int time;

	public FPStatusbar(GContainer parent) {
		this.parent = parent;
		this.points = 0;
		this.render();
	}

	private void render() {
		this.setLayout(new BorderLayout(5, 5));
		
		Panel timerPanel = new Panel();
		timerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 2));
		this.add(timerPanel, BorderLayout.NORTH);
		// Create the 'Time:' label
		Label time = new Label("Time:");
		timerPanel.add(time);
		// Create the label for time
		Label timeValue = new Label(this.getTime(), Label.CENTER);
		timerPanel.add(timeValue);
		
		Panel pointsPanel = new Panel();
		pointsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 2));
		this.add(pointsPanel, BorderLayout.SOUTH);
		// Create the 'Points' Label
		Label points = new Label("Points:");
		pointsPanel.add(points);
		// Create the label for points
		Label pointsValue = new Label(""+this.getPoints(), Label.CENTER);
		pointsPanel.add(pointsValue);
	}

	private String getTime() {
		return "00:0"+this.time;
	}

	private String getPoints() {
		return ""+this.points;
	}

}
