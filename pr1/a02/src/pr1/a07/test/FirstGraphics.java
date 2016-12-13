package pr1.a07.test;
import java.awt.Graphics;
import schimkat.berlin.lernhilfe2016ws.graphics.Drawable;
import pr1.a07.Gitter;
public class FirstGraphics implements Drawable {

	@Override
	public void draw(Graphics g) {
		new Gitter(5,5).draw(g);
		new Gitter(20,20).draw(g);
		g.drawOval(250,250, 40, 40);
		g.drawOval(280, 250, 40, 40);
		g.drawArc(260, 210, 100, 100, 250, 45);
		
		
	}

}
