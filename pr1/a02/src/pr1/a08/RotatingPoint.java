package pr1.a08;

public class RotatingPoint extends Point implements ChangingWithTime{
	
	 
	
	
	private double time;
	private int r;
	
	public RotatingPoint(int x, int y, int r, double time) {
		super(x,y);
		this.r=r;
		this.time=time;
	}
	
	public RotatingPoint(RotatingPoint rp) {
		this(rp.x,rp.y,rp.r,rp.time);
	}
	
	public static void main( String[] args) {
		
	}
	
	
	
	
	@Override
	public void changeTimeTo(double timeValue) {
		x+=r*Math.cos(timeValue);
		y+=r*Math.sin(timeValue);
		
	}
	
	
	
	

}
