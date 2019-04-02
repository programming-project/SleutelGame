import javax.swing.*;

public class Vakje {

	private VeldObject veldObject;

    private JLabel label = new JLabel();

    private int rij;
	private int kolom;

	//constructor van vakje
	public Vakje(int rij, int kolom) {
		this.rij = rij;
		this.kolom = kolom;
	}

	//returned de icoon/afbeelding van het vakje
    public JLabel getIcon() {
        return this.label;
    }

    //set de gegeven veldobject op het vakje
	public void setVeldObject(VeldObject veldObject) {
		this.veldObject = veldObject;
	}

	//returned het veldobject van het vakje
    public VeldObject getVeldObject() {
        return this.veldObject;
    }

    //kijkt of een vakje al een object heeft
    public boolean bevatObject() {
        return veldObject != null;
    }

}