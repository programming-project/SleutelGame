import javax.swing.*;

public class Muur extends VeldObject {

	public Muur(int rij, int kolom) {
		super(rij , kolom);
		super.setIcon(new JLabel(new ImageIcon("src/icons/muur.png")));
	}

	//controleert of je door het object kan lopen
	@Override
	public boolean padVrij() {
		return false;
	}
}