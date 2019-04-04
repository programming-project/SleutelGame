import javax.swing.*;

public class Speler extends VeldObject {

	private Sleutel zak;

	/**
	 * Constructor van speler
	 * @param rij is de startrij van speler
	 * @param kolom is de startkolom van speler
	 */
	public Speler(int rij, int kolom) {
		super(rij, kolom);
		super.setIcon(new JLabel(new ImageIcon("src/icons/steve.png")));
	}

	public void sleutelPakken(){
		//
	}

	/**
	 * Methode om sleutel op te pakken
	 */
	public void setZak(Sleutel sleutel) {
		this.zak = sleutel;

	}

	/**
	 * Getter die de inhoud van zak teruggeeft
	 * @return is sleutel die de speler bevat in zak
	 */
    public Sleutel getZak() {
        return zak;
    }

	@Override
	public void setRij(int rij) {
		super.setRij(getRij() + rij);
		System.out.println(super.getRij());
	}

	@Override
	public void setKolom(int kolom) {
		super.setKolom(getKolom() + kolom);
		System.out.println(super.getKolom());
	}
}