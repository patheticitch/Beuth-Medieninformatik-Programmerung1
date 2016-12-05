package pr1.a07;
import pr1.a07.test.FirstGraphics;
import schimkat.berlin.lernhilfe2016ws.graphics.DirtyPainter;

public class Test {
	
	
	public static void main(String[] args) {
		
		DirtyPainter painter = new DirtyPainter();
		
		painter.add(new FirstGraphics());
		painter.showDrawing();
	}
}
