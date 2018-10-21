package tw.oasisworld.Solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import tw.oasisworld.util.GameUtil;

public class Planet extends Star{

	//除了图片、坐标。行星沿着某个椭圆运行：长轴、短轴、速度。角度，绕着某个Star飞。
	double longAxis;//椭圆的长轴
	double shortAxis;//椭圆的的短怕
	double speed; //飞行的速度
	double degree;//飞行的角度
	Star center;
	boolean satellite; 
	
	
	
	public Planet(String imgpath,double longAxis, 
			double shortAxis, double speed, Star center) {
		super(GameUtil.getImage(imgpath));
		this.center = center;
		this.x = center.x + center.width/2 + longAxis;
		this.y = center.y;
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.center = center;
		
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}

	public Planet(String imgpath,double longAxis, 
			double shortAxis, double speed, Star center,boolean satellite) {
		this(imgpath,longAxis,shortAxis,speed,center);
		this.satellite = satellite;
	}
	
	public void draw(Graphics g) {
		super.draw(g);
		if(!satellite) {
			drawTrace(g);
		}
		move();
	}
	
	public void drawTrace(Graphics g) {
		double OvalX,OvalY,OvalWidth,OvalHeight;
		
		OvalWidth = longAxis*2 /*+ center.width*2*/;
		OvalHeight = shortAxis*2 /*+ center.height*2*/;
		OvalX = (center.x + center.width/2) - longAxis;
		OvalY = (center.y + center.height/2) - shortAxis;
		
		Color c = g.getColor();
		g.setColor(Color.blue);
		g.drawOval((int)OvalX,(int)OvalY,(int)OvalWidth,(int)OvalHeight);
		g.setColor(c);
		
	}
	
	public void move() {
		//沿着椭圆轨迹飞行
				x = (center.x + center.width/2) + longAxis*Math.cos(degree);
				y = (center.y + center.height/2) + shortAxis*Math.sin(degree);
				
				degree += speed;
	}
	
	public Planet(Image img, double x, double y) {
		super(img, x, y);
		// TODO Auto-generated constructor stub
	}
	
	public Planet(String imgpath, double x, double y) {
		super(imgpath, x, y);
		// TODO Auto-generated constructor stub
	}
	
}
