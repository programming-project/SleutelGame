import javax.swing.*;

public abstract class VeldObject {

	private int rij;
	private int kolom;
    private JLabel label;

	public VeldObject(int rij, int kolom) {
		setPositie(rij,kolom);
	}

	public void setRij(int rij) {
		this.rij = rij;
	}

	public void setKolom(int kolom) {
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

	public JLabel getLabel() {
		return this.label;
	}

    public void setLabel(JLabel label) {
        this.label = label;
    }

	public abstract boolean padVrij();
}