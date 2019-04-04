import javax.swing.*;

public class Speler extends VeldObject {

	private Sleutel zak = null;
	private Speelveld speelveld;

	/**
	 * Constructor van speler
	 * @param rij is de startrij van speler
	 * @param kolom is de startkolom van speler
	 */
	public Speler(int rij, int kolom, Speelveld speelveld) {
		super(rij, kolom);
		this.speelveld = speelveld;
		super.setIcon(new JLabel(new ImageIcon("src/icons/steve.png")));
	}

	/**
	 * Methode om te lopen zodat de speler kan bewegen op de speelveld
	 *
	 * @param i        is de afstand die de speler gaat afleggen
	 * @param richting is de kant waar de speler naar toe gaat, de speler kan naar het noorden, zuiden, oosten en westen
	 */
	public void lopen(int i, String richting) {
		if (richting.equals("W") || richting.equals("O")) {
			if ((richting.equals("W") && this.getKolom() != 0) || (richting.equals("O") && this.getKolom() != 9)) {
				if (checkVeldObject(i, richting)) {
					speelveld.getVakjes()[this.getRij()][this.getKolom()].setVeldObject(null);
					this.setKolom(i);
					speelveld.getVakjes()[this.getRij()][this.getKolom()].setVeldObject(this);
					speelveld.updateVeldObjecten();
				}
			}
		} else if (richting.equals("N") || richting.equals("Z")) {
			if ((richting.equals("N") && this.getRij() != 0) || (richting.equals("Z") && this.getRij() != 9)) {
				if (checkVeldObject(i, richting)) {
					speelveld.getVakjes()[this.getRij()][this.getKolom()].setVeldObject(null);
					this.setRij(i);
					speelveld.getVakjes()[this.getRij()][this.getKolom()].setVeldObject(this);
					speelveld.updateVeldObjecten();
				}
			}

		}
	}

	public boolean checkVeldObject(int i, String richting) {
		if (richting.equals("W") || richting.equals("O")) {
			if (speelveld.getVakjes()[this.getRij()][(this.getKolom() + i)].getVeldObject() == null) {
				return true;
			} else if (speelveld.getVakjes()[this.getRij()][(this.getKolom() + i)].getVeldObject() instanceof Sleutel) {
				this.setZak((Sleutel) speelveld.getVakjes()[this.getRij()][(this.getKolom() + i)].getVeldObject());
				return true;
			} else if (speelveld.getVakjes()[this.getRij()][(this.getKolom()+ i)].getVeldObject() instanceof Barricade && this.getZak() != null) {
				if (((Barricade) speelveld.getVakjes()[this.getRij()][(this.getKolom()+i)].getVeldObject()).checkSleutel(this.getZak())) {
					speelveld.removeBarricade(speelveld.getVakjes()[this.getRij()][(this.getKolom()+i)].getVeldObject());
					return true;
				} else {
					return false;
				}
			} else if (speelveld.getVakjes()[this.getRij()][(this.getKolom()+ i)].getVeldObject() instanceof Finish){
				return true;
			} else {
				return false;
			}


		} else if (richting.equals("N") || richting.equals("Z")) {
			if (null == speelveld.getVakjes()[this.getRij() + i][(this.getKolom())].getVeldObject()) {
				return true;
			} else if (speelveld.getVakjes()[this.getRij() + i][(this.getKolom())].getVeldObject() instanceof Sleutel) {
				this.setZak((Sleutel) speelveld.getVakjes()[this.getRij() + i][(this.getKolom())].getVeldObject());
				return true;
			} else if (speelveld.getVakjes()[this.getRij() + i][(this.getKolom())].getVeldObject() instanceof Barricade && this.getZak() != null) {
				if (((Barricade) speelveld.getVakjes()[this.getRij() + i][(this.getKolom())].getVeldObject()).checkSleutel(this.getZak())) {
					speelveld.removeBarricade(speelveld.getVakjes()[this.getRij() + i][(this.getKolom())].getVeldObject());
					return true;
				} else {
					return false;
				}
			} else if (speelveld.getVakjes()[this.getRij() + i][(this.getKolom())].getVeldObject() instanceof Finish){
				return true;
			}
			else {
				return false;
			}
		} else {
			return false;
		}
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