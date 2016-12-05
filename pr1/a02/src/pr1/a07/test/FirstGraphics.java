package pr1.a07.test;
import java.awt.Graphics;

import schimkat.berlin.lernhilfe2016ws.graphics.Drawable;

public class FirstGraphics implements Drawable {

	@Override
	public void draw(Graphics g) {
		g.drawRect(11,50, 20, 40);
		g.drawOval(34, 23, 20, 40);
		
	}

}
