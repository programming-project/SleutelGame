public class Muur extends VeldObject {

	public Muur(int rij, int kolom) {
		super(rij , kolom);
	}

	@Override
	public boolean padVrij() {
		return false;
	}
}