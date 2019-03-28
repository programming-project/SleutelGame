import javax.swing.*;

public abstract class VeldObject {

	private int rij;
	private int kolom;
    private JLabel label;

	public VeldObject(int rij, int kolom) {
		setPositie(rij,kolom);
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
    public void setLabel(JLabel label) {
        this.label = label;
    }

	public abstract boolean padVrij();
}