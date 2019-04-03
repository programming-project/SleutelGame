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

	/**
	 * Methode om sleutel op te pakken
	 */
	public void sleutelPakken() {
	}

	/**
	 * Getter die de inhoud van zak teruggeeft
	 * @return is sleutel die de speler bevat in zak
	 */
    public Sleutel getZak() {
        return zak;
    }

	/**
	 * Methode die kijkt of je door het VeldObject kan door heen lopen
	 * @return is true als je wel door heen kan lopen, false als je niet door heen kan lopen
	 */
    @Override
	public boolean padVrij() {
		return false;
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