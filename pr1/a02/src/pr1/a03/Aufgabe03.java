package pr1.a03;
import schimkat.berlin.lernhilfe2016ws.io.DirtyFileWriter;
import java.util.Random;
import java.io.PrintWriter;
 

public class Aufgabe03 {

	public static void main(String[] args) {
		writeIntNumberFile("./data/numberfile.txt", 200);
		writeMixedNumberFile("./data/mixedNumber.txt",101,6);
		

	}
	
	public static void writeIntNumberFile(String filename, int numbercount) {
		if(numbercount%2!=0) {
			numbercount +=1;
		}
		DirtyFileWriter numberFile = new DirtyFileWriter(filename);
		PrintWriter numberOut = new PrintWriter(numberFile, true);
		for(int i=1;i<=numbercount;i++) {
			double random= Math.random()*100;
			numberOut.printf("%-3d",(int) (random));
			numberOut.print(" ");
			if(i%10==0) {
				numberOut.print("\n");
			}
		}
		numberOut.close();
	}
	
	public static void writeMixedNumberFile(String filename, int numbercount, int width) {
		if(numbercount%2!=0) {
			numbercount +=1;
		}
		DirtyFileWriter numberFile = new DirtyFileWriter(filename);
		PrintWriter numberOut = new PrintWriter(numberFile, true);
		Random choose = new Random();
		for(int i=1;i<=numbercount;i++) {
			double random = Math.random()*100;
			int result = choose.nextInt(2);
			if(i%10==0){
				numberOut.print("\n");
			}
			if(result==0) {
				numberOut.printf("%"+width+"."+(width-3)+"f",random);
			}else {
				numberOut.printf("%0"+width+"d",(int) (random));
			}
			numberOut.print(" ");
		}
		numberOut.close();
		
		
		
	}

}
