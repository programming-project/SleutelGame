import javax.swing.*;

public abstract class VeldObject {

	private int rij;
	private int kolom;
    private JLabel label;

	/**
	 * Constructor voor een VeldObject
	 * @param rij is de positierij van VeldObject
	 * @param kolom is de posotiekolom van VeldObject
	 */
	public VeldObject(int rij, int kolom) {
		setPositie(rij,kolom);
	}

	/**
	 * Setter die de rij zet van het VeldObject
	 * @param rij positie voor rij
	 */
	public void setRij(int rij) {
		this.rij = rij;
	}

	/**
	 * Setter die de kolom zet van het VeldObject
	 * @param kolom positie voor rij
	 */
	public void setKolom(int kolom) {
		this.kolom = kolom;
	}

	/**
	 * Getter die de rij teruggeeft van het VeldObject
	 * @return rij van het VeldObject
	 */
	public int getRij() {
		return rij;
	}

	/**
	 * Getter die de kolom teruggeeft van het VeldObject
	 * @return kolom van het VeldObject
	 */
	public int getKolom() {
		return kolom;
	}

	/**
	 * Setter voor de positie van een VeldObject te zetten
	 * @param rij is de positierij van het VeldObject
	 * @param kolom is de positiekolom van het VeldObject
	 */
	public void setPositie(int rij, int kolom){
		this.rij = rij;
		this.kolom = kolom;
	}

	/**
	 * Getter voor de icoon van VeldObject
	 * @return is de icoon
	 */
	public JLabel getIcon() {
		return this.label;
	}

	/**
	 * Setter die zorgt voor dat een VeldObject een icoon heeft
	 * @param label icoon voor de VeldObject
	 */
    public void setIcon(JLabel label) {
        this.label = label;
    }
}