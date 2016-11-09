package pr1.a02;
import java.io.PrintWriter;
public class Schachbrett {
	
	public static void main(String[] args) {
		PrintWriter out=new PrintWriter(System.out,true);
		printSchachbrett(out);
		out.println();
		printSchachbrettReverse(out);
	
	}
	
	public static void printSchachbrett() {
		for(int i=8;i>0;i--) {
			for(char c='A';c<= 'H';c++) {
				System.out.print(c+""+i+" ");
			}
			System.out.println();
		}
	}
	public static void printSchachbrettReverse() {
		for(int i=1;i<9;i++) {
			for(char c='H'; c>= 'A'; c--) {
				System.out.print(c+""+i+" ");
			}
			System.out.println();
		}
	}
	
	public static void printSchachbrett(PrintWriter out) {
		for(int i=8;i>0;i--) {
			for(char c='A';c<= 'H';c++) {
				out.print(c+""+i+" ");
			}
			out.println();
		}
	}

	public static void printSchachbrettReverse(PrintWriter out) {
		for(int i=1;i<9;i++) {
			for(char c='H'; c>= 'A'; c--) {
				out.print(c+""+i+" ");
			}
			out.println();
		}
	}
}

