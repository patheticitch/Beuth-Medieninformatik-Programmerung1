package pr1.a08;

import java.awt.Color;
import java.awt.Graphics;

import schimkat.berlin.lernhilfe2016ws.graphics.Drawable;

public class ColouredPoint extends Point implements Drawable {
	
	protected Color color;
	
	public ColouredPoint(int x,int y, Color color) {
		super(x,y);
		this.color=color;
	}
	
	public ColouredPoint (Point q, Color color) {
		this(q.x,q.y,color);
	}
	
	public String toString() {
		return "("+super.toString()+color.toString()+")";
	}
	
	

	@Override
	public void draw(Graphics g) {
		final Color BORDER_COLOR = Color.BLACK;
		Color oldColor= g.getColor();
		int x1= (int) x;
		int y1=(int) y;
		g.setColor(BORDER_COLOR);
		g.drawOval(x1-2, y1-2, 5, 5);
		g.setColor(color);
		g.fillOval(x1-2, y1-2, 5, 5);
		g.setColor(oldColor);
		
	}
	
	
}
