import javax.swing.*;

public class Vakje {

	private VeldObject veldObject;

    private JLabel label = new JLabel("X");

    private int rij;
	private int kolom;

    /**
     * Constructor van vakje
     * @param rij is de positierij van vakje
     * @param kolom is de positiekolom van vakje
     */
	public Vakje(int rij, int kolom) {
		this.rij = rij;
		this.kolom = kolom;
	}

    /**
     * Getter die de icoon van een bepaald VeldObject returned
     * @return is de icoon
     */
    public JLabel getIcon() {
        return this.label;
    }

    /**
     * Setter die gegeven VeldObject zet op het vakje
     * @param veldObject is de VeldObject die op het vakje gaat zitten
     */
	public void setVeldObject(VeldObject veldObject) {
		this.veldObject = veldObject;
	}

    /**
     * Getter die de VeldObject op een vakje teruggeeft
     * @return is het VeldObject
     */
    public VeldObject getVeldObject() {
        return this.veldObject;
    }

    /**
     * Methode die kijkt of het vakje een VeldObject bevat of niet
     * @return is
     *
     *
     *
     */
    public boolean bevatObject() {
        return veldObject != null;
    }

    public void setLabel(int i, int j){
        String s = "["+i+ ","+j+"]";
        label.setText(s);
    }

    public boolean padVrij(){
        return true;
    }

}