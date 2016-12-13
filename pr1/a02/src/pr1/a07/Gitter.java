package pr1.a07;
import java.awt.Color;
import java.awt.Graphics;

import schimkat.berlin.lernhilfe2016ws.graphics.Drawable;

public class Gitter implements Drawable {
	
	protected int dx = 100;
	protected int dy= 100;
	protected Color color = Color.YELLOW;
	
	
	public Gitter() {
		
	}
	
	public Gitter (int dx,int dy,Color color) {
		this.dx=dx;
		this.dy=dy;
		this.color=color;
	}
	
	public Gitter(Gitter git) {
		this(git.dx,git.dy,git.color);
	}
	
	public Gitter(int dx, int dy) {
		this.dx=dx;
		this.dy=dy;
		
		
	}
	
	public int getDx() {
		return this.dx; 
	}
	
	public int getDy() {
		return this.dy;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public Color setColor(Color c) {
		return this.color=c;
	}
	
	

	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		for(int x=0;x<=1000;x+=dx) {
			g.drawLine(x, 0, x, 1000);
		}
		for(int y=0;y<=1000;y+=dy) {
			g.drawLine(0, y, 1000, y);
		}
		g.setColor(Color.BLUE);
		g.drawLine(0,0,0,1000);
		g.drawLine(0,1000,1000,1000);
		
		
		
	}

}
