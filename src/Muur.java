import javax.swing.*;

public class Muur extends VeldObject {

	public Muur(int rij, int kolom) {
		super(rij , kolom);
        super.setLabel(new JLabel(new ImageIcon("src/icons/muur.png")));
	}

	@Override
	public boolean padVrij() {
		return false;
	}
}