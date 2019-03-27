public class Barricade extends VeldObject {

	private int sleutelNummer;

	public void checkSleutel(Sleutel sleutel) {
		if(sleutelNummer == sleutel.getSleutelNummer()){
			remove();
		}
	}

	public Barricade(int sleutelNummer, int rij, int kolom) {
		super(rij, kolom);
		this.sleutelNummer = sleutelNummer;
	}

	public void remove(){

	}

	@Override
	public boolean padVrij() {
		return false;
	}
}