public class Speler extends VeldObject {

	private Sleutel zak;

	public Speler(int rij, int kolom) {
		super(rij, kolom);
	}



	public void sleutelPakken() {
	}

	@Override
	public boolean padVrij() {
		return false;
	}
}