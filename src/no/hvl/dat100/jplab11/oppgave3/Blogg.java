package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

import java.util.ArrayList;

public class Blogg {

	// TODO: objektvariable
	private final Innlegg[] samling;
	private int antall;
	private String str;
	public Blogg() {
		samling = new Innlegg[20];
	}

	public Blogg(int lengde) {
		samling = new Innlegg[lengde];
	}

	public int getAntall() {
		return antall;
	}

	public Innlegg[] getSamling() {
		return samling;
	}

	public int finnInnlegg(Innlegg innlegg) {
		for (int i =0;  i < samling.length; i++) {
			if (samling[i]==innlegg)
				return i;
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i =0;  i < samling.length; i++) {
			if (samling[i]==innlegg)
				return true;
		}
		return false;
	}

	public boolean ledigPlass() {
		return antall < samling.length;
	}


	
	public boolean leggTil(Innlegg innlegg) {
		if(ledigPlass()){
			samling[antall] = innlegg;
			antall++;
			return true;
		}
		return false;

	}
	
	public String toString() {
		str = Integer.toString(antall)+"\n";
		for (int i = 0; i < antall; i++) {
			str += samling[i].toString();
		}
		return str;

	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		for (int i =0;  i < samling.length; i++) {
			if (samling[i]==innlegg) {
				samling[i] = null;
				antall--;
				return true;
			}
		}
		return false;
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}
