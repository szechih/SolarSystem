package tw.oasisworld.Solar;

import java.awt.Graphics;
import java.awt.Image;

import tw.oasisworld.util.GameUtil;

public class Star {
	Image img;
	double x,y;
	int width,height;
	
	
	public void draw(Graphics g) {
		g.drawImage(img,(int)x,(int)y,null);
	}
	
	public Star(String imgpath,double x,double y) {
		this(GameUtil.getImage(imgpath),x,y);
		
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}
	
	public Star(Image img,double x,double y) {
		this(img);
		this.x = x;
		this.y = y; 
		
	
	}
	
	public Star(Image img) {
		this.img = img;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}
	
}
