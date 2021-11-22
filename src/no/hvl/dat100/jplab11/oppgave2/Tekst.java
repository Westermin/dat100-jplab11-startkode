package no.hvl.dat100.jplab11.oppgave2;


import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.common.TODO;

public class Tekst extends Innlegg {

	// TODO: objektvariable
	private String tekst;
	protected String startTekst = "TEKST";
	public Tekst () {
		//this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id,bruker,dato);
		this.tekst = tekst;

	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id,bruker,dato,likes);
		this.tekst = tekst;
	}


	// gets
	public String getTekst() {
		return tekst;
	}
	// sets
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		return String.format(startTekst+"\n"+super.toString()+ this.tekst+"\n");
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
