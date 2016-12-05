package pr1.a07.test;

import java.awt.Graphics;

import schimkat.berlin.lernhilfe2016ws.graphics.Drawable;

public class Lines implements Drawable  {

	@Override
	public void draw(Graphics g) {
		g.drawLine(1,35,456,234);
		g.drawLine(45,321,124,224);
		g.drawLine(123,334,41,122);
		g.drawLine(15,55,423,234);
		
	}

}
