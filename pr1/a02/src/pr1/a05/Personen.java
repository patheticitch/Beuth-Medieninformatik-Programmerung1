package pr1.a05;			
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

import schimkat.berlin.lernhilfe2016ws.io.DirtyFileReader;
import schimkat.berlin.lernhilfe2016ws.io.DirtyFileWriter;
import schimkat.berlin.lernhilfe2016ws.objectPlay.Person;
import schimkat.berlin.lernhilfe2016ws.objectPlay.PersonFactory;
import schimkat.berlin.lernhilfe2016ws.objectPlay.PersonList;
import schimkat.berlin.lernhilfe2016ws.objectPlay.PersonSet;

public class Personen {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		PrintWriter out= new PrintWriter(System.out,true);
		aufgabeC(out);
		out.close();
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
		printPersons(persons,out);
		file.close();
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
		dataSource.close();
		return persons;
		
	}
	
	
	public static PersonSet SundK(PersonSet S, PersonSet K) {
		S.retainAll(K);
		return S;
	}
	
	
	public static PersonSet KaberNichtS(PersonSet S, PersonSet K) {
		K.removeAll(S);
		return K;
	
	}
	
	public static PersonSet TvereinigtK(PersonSet K) {
		 K.addAll(PersonFactory.createTestPersonSet());
		 return K;
		 
		
	}
	
	  static void aufgabeC(PrintWriter out) {
		 
		 PersonSet S= getPersonsFrom("./data/sportfreunde.txt");
		 PersonSet K = getPersonsFrom("./data/kommilitonen.txt");
		 printPersons(SundK(S,K),out);
		 printPersons(KaberNichtS(S,K),out);
		 printPersons(TvereinigtK(K),out);
		 
		
	}
}
