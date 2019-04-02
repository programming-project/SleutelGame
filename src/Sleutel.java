public class Sleutel extends VeldObject {

	private int sleutelNummer;

	//constructor voor sleutel
	public Sleutel(int sleutelNummer, int rij, int kolom) {
		super(rij , kolom);
		this.sleutelNummer = sleutelNummer;
	}

	//returned sleutel waarde
	public int getSleutelNummer() {
		return sleutelNummer;
	}

	//controleert of het padvrij is
	@Override
	public boolean padVrij() {
		return true;
	}
}