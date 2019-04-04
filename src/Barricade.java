import javax.swing.*;

public class Barricade extends VeldObject {

	private int sleutelNummer;

	public Barricade(int sleutelNummer, int rij, int kolom) {
		super(rij, kolom);
		this.sleutelNummer = sleutelNummer;

		if(sleutelNummer == 100){
			super.setIcon(new JLabel(new ImageIcon("src/icons/ironore.png")));
		}else if(sleutelNummer == 200){
			super.setIcon(new JLabel(new ImageIcon("src/icons/goldore.png")));
		}else if(sleutelNummer == 300){
			super.setIcon(new JLabel(new ImageIcon("src/icons/diamondore.png")));
		}
	}

	public void checkSleutel(Sleutel sleutel) {
		if(sleutelNummer == sleutel.getSleutelNummer()){
			remove();
		}
	}

	public void remove(){

	}
}