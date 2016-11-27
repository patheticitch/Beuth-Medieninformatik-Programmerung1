package pr1.a03;							//Dinitz 864398
import java.io.PrintWriter;

public class Hypothenuse {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out, true);
		testHypothenuse(7,4,out);
		
		

	}
	
	public static double hypothenuse (double k1, double k2) {
		double hypo= Math.sqrt(Math.pow(k1, 2)+Math.pow(k2, 2));
		return hypo;
	}
	
	public static void printHypothenuse( double k1, double k2, int width, int precision, PrintWriter out) {
		out.printf("%"+width+"."+precision+"f",hypothenuse(k1,k2));
	}
	
	public static void testHypothenuse(int width, int precision, PrintWriter out) {
		
		for(int i=0; i<11;i++) {
			for(int q=0; q<11; q++) {
				printHypothenuse(q,i,width,precision,out);
				out.print("   ");
				
			}
			out.println();
			
		}
		
		
	}

}
