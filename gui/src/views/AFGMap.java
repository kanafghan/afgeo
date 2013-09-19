package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Panel;

import main.Game;

public class AFGMap extends GContainer {
	private static final long serialVersionUID = 1L;
	
	public AFGMap(GView parent) {
		super(parent);
	}
	
	public void init() {
		//this.setSize(new Dimension(500, 300));
	}
	
	public void paint(Graphics g) {
		final int MID = 150;
		final int TOP = 50;
		
		this.setBackground(Color.cyan);
		
		g.setColor(Color.BLUE);
		g.drawLine(TOP, MID, 50, 70);
		
		g.setColor(Color.black);
		g.fillOval(MID - 20, TOP, 40, 40);
		g.drawString("Bah Bah", 100, 50);
		 
		//TODO add map here
	}
}
