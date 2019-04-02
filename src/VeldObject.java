import javax.swing.*;

public abstract class VeldObject {

	private int rij;
	private int kolom;
    private JLabel label;

    //constructor van de veldobjecten
	public VeldObject(int rij, int kolom) {
		setPositie(rij,kolom);
	}

	//set de rij van het object
	public void setRij(int rij) {
		this.rij = rij;
	}

	//set de kolom van het object
	public void setKolom(int kolom) {
		this.kolom = kolom;
	}

	//returned de rij van het object
	public int getRij() {
		return rij;
	}

	//returned de kolom van het object
	public int getKolom() {
		return kolom;
	}

	//set de positie van het object
	public void setPositie(int rij, int kolom){
		this.rij = rij;
		this.kolom = kolom;
	}

	//returned de icoon/afbeelding van het object
	public JLabel getIcon() {
		return this.label;
	}

	//stelt de icoon/afbeelding van het object
    public void setIcon(JLabel label) {
        this.label = label;
    }

	public abstract boolean padVrij();
}