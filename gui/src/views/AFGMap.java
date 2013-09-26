package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import utils.Constants;

import main.Game;

public class AFGMap extends GContainer {
	private static final long serialVersionUID = 1L;
	private String base;

	public AFGMap(GView parent) {
		super(parent);
		this.base = Constants.PROVINCE_IMAGES_FOLDER;
	}

	public void paint(Graphics g) {
		this.setBackground(Color.white);

		File imgfile = new File(this.base +"afg-map.png");
		if (imgfile.exists()) {
			Image image;
			try {
				image = ImageIO.read(imgfile);
				g.drawImage(image, 1, 15, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		else {
			System.out.println("image not found!!");
		}
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}
}
