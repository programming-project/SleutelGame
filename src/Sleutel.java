public class Sleutel extends VeldObject {

	private int sleutelNummer;

	public Sleutel(int sleutelNummer, int rij, int kolom) {
		super(rij , kolom);
		this.sleutelNummer = sleutelNummer;
	}

	public int getSleutelNummer() {
		return sleutelNummer;
	}

	@Override
	public boolean padVrij() {
		return true;
	}
}