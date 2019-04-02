import javax.swing.*;

public class Speler extends VeldObject {

	private Sleutel zak;

	public Speler(int rij, int kolom) {
		super(rij, kolom);
		super.setIcon(new JLabel(new ImageIcon("src/icons/steve.png")));
	}

	public void sleutelPakken() {
	}

    public Sleutel getZak() {
        return zak;
    }

    @Override
	public boolean padVrij() {
		return false;
	}

	@Override
	public void setRij(int rij) {
		int i = getRij() + rij;
		super.setRij(i);
	}

	@Override
	public void setKolom(int kolom) {
		int i = getKolom() + kolom;
		super.setRij(i);
	}
}