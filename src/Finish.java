public class Finish extends VeldObject {

	public Finish(int rij, int kolom) {
		super(rij, kolom);
	}

	public void spelGewonnen() {
	}

	@Override
	public boolean padVrij() {
		return true;
	}
}