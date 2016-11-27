package pr1.a03;								//Dinitz 864398
import schimkat.berlin.lernhilfe2016ws.io.DirtyFileWriter;
import java.io.PrintWriter;
import pr1.a02.Schachbrett;
import java.util.Locale;


public class TestSchachbrett {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		printSchachbrett("./data/schachbrett.txt",true);
		printSchachbrett("./data/schachbrett2.txt",false);
		
	}
	
	public static void printSchachbrett(String filename, boolean isReverse) {
		DirtyFileWriter schachBrettTest = new DirtyFileWriter(filename);
		PrintWriter sbout = new PrintWriter(schachBrettTest,true);
		if(isReverse) {
			Schachbrett.printSchachbrettReverse(sbout);
				
		} else {
			Schachbrett.printSchachbrett(sbout);
		}
		
	}
	
	
	
	
	
	

}
