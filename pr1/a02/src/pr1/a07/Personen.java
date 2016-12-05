package pr1.a07;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

import pr1.a06.Person;
import schimkat.berlin.lernhilfe2016ws.io.DirtyFileReader;
import schimkat.berlin.lernhilfe2016ws.io.DirtyFileWriter;

public class Personen {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		PrintWriter out= new PrintWriter(System.out,true);
		ArrayList<Person> test = createTestPersonliste();
		printPersons(sortByName(test),out);
		
		
	}

	public static void printPersons(ArrayList <pr1.a06.Person> persons, PrintWriter out) {
		 for(pr1.a06.Person p: persons) {
			 out.println(p.getVorname()+" "+p.getNachname()+" "+p.getGeburtsjahr());
				out.flush();
		 }
	}

	public static void printPersons(HashSet<pr1.a06.Person> persons, PrintWriter out) {
		for(pr1.a06.Person p: persons) {
			out.print(p.getVorname()+" "+p.getNachname()+" "+p.getGeburtsjahr());
			out.println();
			out.flush();
		}
	}


	public static void printPersons(HashSet<pr1.a06.Person> persons, String filename) {
		DirtyFileWriter file = new DirtyFileWriter(filename);
		PrintWriter out= new PrintWriter(file,true);
		printPersons(persons,out);
		file.close();
		out.close();
	}

	public static pr1.a06.Person createPerson(Scanner dataSource) {
		String vorname= dataSource.next();
		String nachname = dataSource.next();
		int geburtsjahr = dataSource.nextInt();
		return new pr1.a06.Person(vorname,nachname,geburtsjahr);
	}



	public static ArrayList<pr1.a06.Person> getPersonsFrom(Scanner dataSource) {
		ArrayList<pr1.a06.Person> persons = new ArrayList<pr1.a06.Person>();
		while(dataSource.hasNext()) {
			persons.add(createPerson(dataSource));
		}

		return persons;
	}

	public static ArrayList<pr1.a06.Person> getPersonsFrom(String filename) {
		DirtyFileReader file = new DirtyFileReader(filename);
		Scanner dataSource = new Scanner (file);
		ArrayList<pr1.a06.Person> persons=getPersonsFrom(dataSource);
		file.close();
		dataSource.close();
		return persons;
	}

	public static ArrayList <pr1.a06.Person> createTestPersonliste() {
		schimkat.berlin.lernhilfe2016ws.objectPlay.PersonList testliste = schimkat.berlin.lernhilfe2016ws.objectPlay.PersonFactory.createTestPersonliste();
		ArrayList<pr1.a06.Person> list = new ArrayList <pr1.a06.Person> ();
		for(schimkat.berlin.lernhilfe2016ws.objectPlay.Person p: testliste) {
			list.add(new pr1.a06.Person(p));
		}
		return list;

	}

	public static ArrayList <pr1.a06.Person> createTestPersonSet() {
		schimkat.berlin.lernhilfe2016ws.objectPlay.PersonSet testset = schimkat.berlin.lernhilfe2016ws.objectPlay.PersonFactory.createTestPersonSet();
		ArrayList<pr1.a06.Person> list = new ArrayList <pr1.a06.Person> ();
		for(schimkat.berlin.lernhilfe2016ws.objectPlay.Person p: testset) {
			list.add(new pr1.a06.Person(p));
		}
		return list;
	}

	public static ArrayList <Person> SundK (ArrayList <Person> S, ArrayList <Person> K) {
		ArrayList <Person> vereinigt = new ArrayList <Person>(S);
		 vereinigt.retainAll(K);
		return vereinigt;
	}

	public static ArrayList <Person> KaberNichtS(HashSet <Person> S, ArrayList <Person> K) {
		ArrayList <Person> kNichtS = new ArrayList <Person>(K);
		kNichtS.removeAll(S);
		return kNichtS;
	}

	public static ArrayList <Person>  TvereinigtK(ArrayList <Person>  K) {

		ArrayList <Person> vereinigt = new ArrayList <Person>(K);
		vereinigt.addAll(createTestPersonSet());
		return vereinigt;
	}
	
	public static ArrayList<Person> sortByYear(ArrayList<Person> persons) {
		Comparator<Person> com= new YearComperator();
			persons.sort(com);
			return persons;
		}
	
	public static ArrayList<Person> sortByName(ArrayList<Person> persons) {
		Comparator<Person> com= new NameComparator();
		persons.sort(com);
		return persons;
	}


	 
}

	
	
	
