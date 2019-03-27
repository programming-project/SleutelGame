public abstract class GameObject {

	private int rij;
	private int kolom;
	private Type type;

	public enum Type {
		SLEUTEL,
		SPELER,
		BARRICADE,
		MUUR
	}

	public GameObject(int rij, int kolom) {
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}