import javax.swing.*;

public class Vakje {

	private VeldObject veldObject;

    private JLabel label = new JLabel();

    private int rij;
	private int kolom;

	public Vakje(int rij, int kolom) {
		this.rij = rij;
		this.kolom = kolom;
	}

    public JLabel getIcon() {
        return this.label;
    }

	public void setVeldObject(VeldObject veldObject) {
		this.veldObject = veldObject;
	}

    public VeldObject getVeldObject() {
        return this.veldObject;
    }

    public boolean bevatObject() {
        return veldObject != null;
    }

}