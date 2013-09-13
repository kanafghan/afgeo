package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MapContainer extends Panel implements ActionListener {
	Panel N;
	Panel S;
	Panel W;
	Panel E;
	Panel Answerone;
	Panel Answertwo;
	Panel Answerthree;
	Panel Answerfour;
	Panel Points;
	Panel Back;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MapContainer MapContainer;

	public void init() {
		this.setSize(new Dimension(500, 300));
		this.MapContainer = new MapContainer();

		this.renderMainWindow(this.MapContainer);
	}

	// TODO Auto-generated method stub
	private void renderMainWindow(MapContainer mapContainer2) {
		Panel p = new Panel();

		setLayout(new BorderLayout());
		setBackground(Color.red);
		setForeground(Color.white);

		p.setBackground(Color.lightGray);
		p.setLayout(new GridLayout(2, 3));

		add("North", N);
		add("South", S);
		add("Center", p);
		add("West", W);
		add("East", E);
		p.add(Answerone);
		p.add(Answertwo);
		p.add(Answerthree);
		p.add(Answerfour);
		p.add(Points);
		p.add(Back);

		// N.addActionListener(this);
		// S.addActionListener(this);
		// E.addActionListener(this);
		// W.addActionListener(this);
		// Answerone.addActionListener(this);
		// Answerone.addActionListener(this);
		// Answertwo.addActionListener(this);
		// Answerthree.addActionListener(this);
		// Answerfour.addActionListener(this);
		// Back.addActionListener(this);
	}

	public void paint(Graphics g) {

		// final int MID = 150;
		// final int TOP = 50;
		//
		// g.setColor(Color.BLUE);
		// g.drawLine(TOP, MID, 50, 70);
		//
		// g.setColor(Color.black);
		// g.fillOval(MID - 20, TOP, 40, 40);
		// g.drawString("Bah Bah", 100, 50);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == N) {
			showStatus("North button pushed");
		} else if (e.getSource() == S) {
			showStatus("South button pushed");
		} else if (e.getSource() == E) {
			showStatus("East button pushed");
		} else if (e.getSource() == W) {
			showStatus("West button pushed");
		} else if (e.getSource() == Answerone) {
			showStatus("Panel 0 0 button pushed");
		} else if (e.getSource() == Answertwo) {
			showStatus("Panel 0 1 button pushed");
		} else if (e.getSource() == Answerthree) {
			showStatus("Panel 0 2 button pushed");
		} else if (e.getSource() == Answerfour) {
			showStatus("Panel 1 0 button pushed");
		} else if (e.getSource() == Points) {
			showStatus("Panel 1 1 button pushed");
		} else if (e.getSource() == Back) {
			showStatus("Panel 1 2 button pushed");
		}

	}

	private void showStatus(String string) {
		// TODO Auto-generated method stub

	}
}
