package tw.oasisworld.Solar;

import java.awt.Graphics;
import java.awt.Image;

import tw.oasisworld.util.Constant;
import tw.oasisworld.util.GameUtil;
import tw.oasisworld.util.MyFrame;

/**
 * 太阳系的主窗口
 * @author Administrator
 *
 */
public class SoalarFrame extends MyFrame {
	Image bg = GameUtil.getImage("images/bg.jpg");
	Star 太阳 = new Star("images/太阳.png",450,350);
	Planet 水星 = new Planet("images/水星.png",150,100,0.1,太阳);
	Planet 金星 = new Planet("images/金星.png",180,120,0.08,太阳);
	Planet 地球 = new Planet("images/地球.png",200,150,0.05,太阳);
	Planet 火星 = new Planet("images/火星.png",220,180,0.03,太阳);
	Planet 木星 = new Planet("images/木星.png",240,200,0.02,太阳);
	Planet 土星 = new Planet("images/土星.png",260,220,0.01,太阳);
	Planet 天王星 = new Planet("images/天王星.png",280,240,0.008,太阳);
	Planet 海王星 = new Planet("images/海王星.png",300,260,0.005,太阳);
	Planet 月球 = new Planet("images/月球.png",15,10,0.12,地球,true);
	
	public void paint(Graphics g) {
		g.drawImage(bg,0,0,null);
		太阳.draw(g);
		水星.draw(g);
		金星.draw(g);
		地球.draw(g);
		火星.draw(g);
		木星.draw(g);
		土星.draw(g);
		天王星.draw(g);
		海王星.draw(g);
		月球.draw(g);
	}
	
	public static void main(String[] args) {
		
		new SoalarFrame().launchFrame();
	}
}
