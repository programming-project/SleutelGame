import javax.swing.*;

public class Speler extends VeldObject {

	private Sleutel zak;

	public Speler(int rij, int kolom) {
		super(rij, kolom);
		super.setLabel(new JLabel(new ImageIcon("src/icons/steve.png")));
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
}