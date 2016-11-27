package pr1.a05;			//Dinitz 864398
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Locale;
import schimkat.berlin.lernhilfe2016ws.objectPlay.*;
import schimkat.berlin.lernhilfe2016ws.io.*;





public class Personen {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		PrintWriter out= new PrintWriter(System.out,true);
		aufgabeC(out);
		
		
	}
	
	public static void printPersons(PersonList persons, PrintWriter out) {
		 for(Person p: persons) {
			 out.println(p);
		 }
		
		
		
		
				
				
		
	}
	
	public static void printPersons(PersonSet persons, PrintWriter out) {
		for(Person p: persons) {
			out.println(p);
		}
	}
	public static void printPersons(PersonSet persons, String filename) {
		DirtyFileWriter file = new DirtyFileWriter(filename);
		PrintWriter out= new PrintWriter(file,true);
		for(Person p: persons) {
			out.println(p);
		}
		out.close();
		
	}
	
	public static Person createPerson(Scanner dataSource) {
		String vorname= dataSource.next();
		String nachname = dataSource.next();
		int geburtsjahr = dataSource.nextInt();
		return new Person(vorname,nachname,geburtsjahr);
	}
	
	
	
	public static PersonSet getPersonsFrom(Scanner dataSource) {
		PersonSet persons = new PersonSet();
		while(dataSource.hasNext()) {
			persons.add(createPerson(dataSource));
		}
		
		return persons;
	}
	
	public static PersonSet getPersonsFrom(String filename) {
		DirtyFileReader file = new DirtyFileReader(filename);
		Scanner dataSource = new Scanner (file);
		PersonSet persons=getPersonsFrom(dataSource);
		return persons;
	}
	
	public static PersonSet SundK(PersonSet S, PersonSet K) {
		PersonSet SundK= new PersonSet();
		 for(Person p: S) {
			 if(K.contains(p)) {
				 SundK.add(p);
			 }else {
				 continue;
			 }
		 }
		 return SundK;
	}
	
	public static PersonSet KaberNichtS(PersonSet S, PersonSet K) {
		PersonSet KaberNichtS= new PersonSet();
		for(Person p: K) {
			if(S.contains(p)) {
				continue;
			}else{
				KaberNichtS.add(p);
			}
		}
		return KaberNichtS;
	}
	
	public static PersonSet TvereinigtK(PersonSet K) {
		 PersonSet T = PersonFactory.createTestPersonSet();
		 for(Person p: K) {
			 T.add(p);
		 }
		 return T;
		
	}
	
	
	
	 static void aufgabeC(PrintWriter out) {
		 
		 PersonSet S= getPersonsFrom("./data/sportfreunde.txt");
		 PersonSet K = getPersonsFrom("./data/kommilitonen.txt");
		 printPersons(SundK(S,K),"./listen/SundK.txt");
		 printPersons(KaberNichtS(S,K),"./listen/KaberNichtS.txt");
		 printPersons(TvereinigtK(K),"./listen/TvereinigtK.txt");
		 
		
		
	}
}
