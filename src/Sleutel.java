import javax.swing.*;

public class Sleutel extends VeldObject {

	private int sleutelNummer;

	//constructor voor sleutel
	public Sleutel(int sleutelNummer, int rij, int kolom) {
		super(rij , kolom);
		this.sleutelNummer = sleutelNummer;

		if(sleutelNummer == 100){
			super.setIcon(new JLabel(new ImageIcon("src/icons/ironaxe.png")));
		}else if(sleutelNummer == 200){
			super.setIcon(new JLabel(new ImageIcon("src/icons/goldaxe.png")));
		}else if(sleutelNummer == 300){
			super.setIcon(new JLabel(new ImageIcon("src/icons/diamondaxe.png")));
		}
	}

	//returned sleutel waarde
	public int getSleutelNummer() {
		return sleutelNummer;
	}

	//controleert of het padvrij is
	@Override
	public boolean padVrij() {
		return true;
	}
}