package no.hvl.dat100.jplab11.oppgave1;
import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {


	private int id;
	private int likes;
	private String bruker;
	private String dato;
	private String tekst;
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.id =id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	//Sets

	public void setId() {
		this.id=id;
	}
	public void setBruker(String bruker) {
		this.bruker=bruker;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
	public void doLike () {
		this.likes += 1;
	}


	//Gets
	public int getId() {
		return id;
	}
	public String getBruker() {
		return bruker;
	}
	public String getDato() {
		return dato;

	}
	public int getLikes() {
		return likes;
	}

	
	public boolean erLik(Innlegg innlegg) {

		return ((innlegg.id == id) && (innlegg.bruker == bruker)&&(innlegg.dato == dato));
	}
	
	@Override
	public String toString() {
		return String.format("%d\n%s\n%s\n%d\n",id,bruker,dato,likes);
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
