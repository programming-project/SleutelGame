import javax.swing.*;

public class Finish extends VeldObject {

	public Finish(int rij, int kolom) {
		super(rij, kolom);
		super.setIcon(new JLabel(new ImageIcon("src/icons/finish.png")));
	}

	public void spelGewonnen() {
		JOptionPane.showMessageDialog(null, "Je hebt het spel gewonnen hoera! Bedankt voor het spelen!");

	}

}