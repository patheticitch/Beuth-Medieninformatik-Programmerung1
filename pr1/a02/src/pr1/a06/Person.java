package pr1.a06;


public class Person {
	
	private String Vorname;
	private String Nachname;
	private int Geburtsjahr;

	public static void main(String[] args) {
		

	}
	public Person(String Vorname, String Nachname, int Geburtsjahr) {
		this.Vorname=Vorname;
		this.Nachname=Nachname;
		this.Geburtsjahr=Geburtsjahr;
		
	}
	
	public Person(Person person) {
		this(person.Vorname,person.Nachname,person.Geburtsjahr);
		
	}
	
	public Person(schimkat.berlin.lernhilfe2016ws.objectPlay.Person person) {
		this(person.getVorname(),person.getNachname(),person.getGeburtsjahr());
		
	}
	
	public  String toString(Person person) {
		return person.Vorname+" "+person.Nachname+" "+person.Geburtsjahr;
		
	}
	
	public String getVorname() {
		return this.Vorname;
	}
	
	public String getNachname() {
		return this.Nachname;
	}
	public int getGeburtsjahr () {
		return this.Geburtsjahr;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Geburtsjahr;
		result = prime * result + ((Nachname == null) ? 0 : Nachname.hashCode());
		result = prime * result + ((Vorname == null) ? 0 : Vorname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (Geburtsjahr != other.Geburtsjahr)
			return false;
		if (Nachname == null) {
			if (other.Nachname != null)
				return false;
		} else if (!Nachname.equals(other.Nachname))
			return false;
		if (Vorname == null) {
			if (other.Vorname != null)
				return false;
		} else if (!Vorname.equals(other.Vorname))
			return false;
		return true;
	}
	
	

}
