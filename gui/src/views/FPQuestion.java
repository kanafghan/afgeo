package views;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import utils.Constants;

public class FPQuestion extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private GContainer parent;

	public FPQuestion(GContainer parent) {
		this.parent = parent;
		this.render();
	}
	public void ask(){
		this.getRandomProvince();
		this.renderQuestion();
	}

	private void renderQuestion() {
		// TODO Auto-generated method stub
		
	}
	private void getRandomProvince() {
		// TODO Auto-generated method stub
		
	}
	private void render() {		
		this.setLayout(new GridLayout(5, 1));

		// The question?
		Label question = new Label("Which province is highlighted?");
		this.add(question);
		for (int i = 0; i < 4; i++) {
			this.add(new Button("Answer " + (i + 1)));
		}
	}
}
