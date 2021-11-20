package no.hvl.dat100.jplab11.oppgave4;

import java.io.*;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		File file = new File(mappe+filnavn);

		String data = samling.toString();

		try(FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {

			byte[] bytes = data.getBytes();

			bos.write(bytes);
			bos.close();
			fos.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
