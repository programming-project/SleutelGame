public class Speler extends VeldObject {

	private Sleutel zak;

	public Speler(int rij, int kolom) {
		super(rij, kolom);
	}

	public void sleutelPakken() {
	}

    public Sleutel getZak() {
        return zak;
    }

    @Override
	public boolean padVrij() {
		return false;
	}
}