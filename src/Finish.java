import javax.swing.*;

public class Finish extends VeldObject {

	public Finish(int rij, int kolom) {
		super(rij, kolom);
		super.setIcon(new JLabel(new ImageIcon("src/icons/finish.png")));
	}

	public void spelGewonnen() {
	}

	@Override
	public boolean padVrij() {
		return true;
	}
}