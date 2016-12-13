package pr1.a08;


import schimkat.berlin.lernhilfe2016ws.graphics.DirtyPainter;

public class Test {

	public static void main(String[] args) {
		DirtyPainter painter = new DirtyPainter();
		
		for(double t=0; t>=0;t++) {
			RotatingPoint point = new RotatingPoint(200,200,20,t);
			point.changeTimeTo(t);
			painter.add(point);
			painter.showDrawingAfterWaiting(1);
			painter.remove(point);
		}
		
		
	}

}
