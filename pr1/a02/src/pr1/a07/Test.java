package pr1.a07;
import java.awt.Color;
import schimkat.berlin.lernhilfe2016ws.graphics.DirtyPainter;

public class Test {
	
	
	public static void main(String[] args) {
		
		DirtyPainter painter = new DirtyPainter();
		painter.add(new Gitter(100,100,Color.GREEN));
        painter.showDrawing();
	}
}
