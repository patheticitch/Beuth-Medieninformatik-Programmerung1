package pr1.a04; 	//Dinitz 864398
import java.io.PrintWriter; 
import schimkat.berlin.lernhilfe2016ws.io.DirtyFileReader;
import schimkat.berlin.lernhilfe2016ws.io.DirtyFileWriter;
import java.util.Scanner;
import java.util.Locale;


public class FirstInput {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//copyNumberFile("./data/testfiles/zahlen01.txt","./data/testfiles/zahlen01copy.txt",10,4);
		System.out.print(countSumOf("./data/testfiles/zahlen03.txt"));
		
		
	}
	
	public static void printScanner(Scanner in, PrintWriter out) {
		while(in.hasNext()) {
			out.print("Zahl: "+in.next()+" ");
		}
		in.close();
		out.println();
	}
	
	public static void ScannerAusprobieren(PrintWriter out) {
		String intNumbers= "1 2 3 4 5 6 7 8 9";
		String doubleNumbers = "1.0 2.0 3.0 4.0 5.0 6.0 7.0 8.0 9.0 ";
		String mixedNumbers = "1 2 2.6 3.1 9 4.3 5 13.4 39";
		Scanner intScanner = new Scanner(intNumbers);
		Scanner doubleScanner= new Scanner(doubleNumbers);
		Scanner mixedScanner = new Scanner (mixedNumbers);
		printScanner(intScanner,out);
		printScanner(doubleScanner,out);
		printScanner(mixedScanner,out);
		DirtyFileReader fileReader = new DirtyFileReader("./data/testfiles/zahlen01.txt");
		Scanner fileScanner = new Scanner(fileReader);
		printScanner(fileScanner,out);
		
	
	}
	
	public static int countSumOf(Scanner in) {
		int sum=0;
		while(in.hasNext()) {
			if(in.hasNextInt()) {
				sum+=in.nextInt();
			}else{
				sum += in.nextDouble();
			}
			
		}
		in.close();
		return sum;
	}
	
	public static int countSumOf(String filename) {
		DirtyFileReader fileReader = new DirtyFileReader(filename);
		Scanner in= new Scanner(fileReader);
		return countSumOf(in);
	}
	
	public static void printNumbersFrom(Scanner in, int width, int precision, PrintWriter out) {
		int count= 0;
		while(in.hasNext()) {
			out.printf("%"+width+"."+precision+"f",in.nextDouble());
			out.print(" ");
			count++;
			if(count%10==0) {
				out.println();
			}
		}	
	}
	
	public static void copyNumberFile (String filename, String location, int width, int precision) {
		DirtyFileReader file = new DirtyFileReader(filename);
		Scanner in = new Scanner(file);
		DirtyFileWriter fwout= new DirtyFileWriter(location);
		PrintWriter out= new PrintWriter(fwout,true);
		printNumbersFrom(in,width,precision,out);
	}
}
