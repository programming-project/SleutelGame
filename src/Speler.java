import javax.swing.*;

public class Speler extends VeldObject {

	private Sleutel zak;

	//constructor van speler
	public Speler(int rij, int kolom) {
		super(rij, kolom);
		super.setIcon(new JLabel(new ImageIcon("src/icons/steve.png")));
	}

	//methode om sleutel op te pakken
	public void sleutelPakken() {
	}

	//returned de sleutel die de speler bevat
    public Sleutel getZak() {
        return zak;
    }

    //kijkt of het object padvrij is
    @Override
	public boolean padVrij() {
		return false;
	}
}