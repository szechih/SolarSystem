package tw.oasisworld.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * 游戏开发中常用的工具类（比如：图片加载等方法） 
 * @author Administrator
 *
 */
public class GameUtil {
	
	private GameUtil() {}//工具类通常将构造方法私有了。
	
	public static Image getImage(String path) {
		/*URL u = GameUtil.class.getClassLoader().getResource(path);
		BufferedImage img = null; 
		try {
			img = ImageIO.read(u);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;*/
		return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(path));
	}
}
