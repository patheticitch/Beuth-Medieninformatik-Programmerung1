import java.io.PrintWriter;										//Dinitz 864398
public class MoreMethods {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out,true);
		printAlphabet(out,false);
		printAlphabet(out,true);
		//printCharSeries(out,'F',11);
		printCharSeries(out,'a',14);
		
				

	}
	public static void printText(PrintWriter out, String Text) {
		out.println(Text);
	}
	public static void printAlphabet(PrintWriter out,boolean smallLetters) {
		printText(out,createAlphabet(smallLetters));
	}
	public static String createAlphabet(boolean smallLetters) {
		String alpha="";//empty String that's going to contain the alphabet devided by spaces
		if(smallLetters) {
			for(char i='a';i<='z';i++) {
				alpha+=i;
				alpha+=" ";
			}
		}else {
			for(char i='A';i<='Z';i++) {
				alpha+=i;
				alpha+=" ";
			}
		}
		return alpha;
			
		}
	public static String createCharSeries(char startChar, int anzahl){
		String series="";//empty string to store a series of characters
		int count=0; //counting the strings starts at one
		for (char i=startChar;i<startChar+anzahl;i++) {	
			if(((count+1)%10==0 && count!=0)  || count==anzahl) {	//puts a new line every 10 characters and at the end ignoring the first character
				series+=i; //appends the current character to a string
				series+="\n"; //appends a new line to the string 
				count++;	//increases the counter by 1
			}else {
				series+=i;
				count++;
			
			}
		} return series;
	}
	public static void printCharSeries(PrintWriter out, char startChar, int anzahl) {
		printText(out,createCharSeries(startChar, anzahl));
	}
	
}
