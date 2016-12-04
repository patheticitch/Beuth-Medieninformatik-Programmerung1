package pr1.a06;
import java.io.PrintWriter;


public class PersonTest {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out,true);
		Person person = new Person("Nick","Drake",1947);
		String st1=person.toString(person);
		Person person2= new Person(person);
		String st2=person2.toString(person2);
		schimkat.berlin.lernhilfe2016ws.objectPlay.Person person3 = new schimkat.berlin.lernhilfe2016ws.objectPlay.Person("Kurt","Cobain",1976);
		Person person4= new Person(person3);
		String st3=person4.toString(person4);
		out.println(st1);
		out.println(st2);
		out.println(st3);

	}

}
