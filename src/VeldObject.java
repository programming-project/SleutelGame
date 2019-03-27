public abstract class VeldObject {

	private int rij;
	private int kolom;

	public VeldObject(int rij, int kolom) {
		this.rij = rij;
		this.kolom = kolom;
	}

	public int getRij() {
		return rij;
	}

	public int getKolom() {
		return kolom;
	}

	public void setPositie(int rij, int kolom){
		this.rij = rij;
		this.kolom = kolom;
	}

	public abstract boolean padVrij();
}