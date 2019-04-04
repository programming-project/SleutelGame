import javax.swing.*;
import java.awt.*;

public class Speelveld extends JPanel {

    private Level level;
    private Speler speler;
    private Finish finish;
    private Vakje[][] vakjes;

    /**
     * Maakt een gridlayout voor de vakjes aan
     */
    public JPanel veldGrid = new JPanel(new GridLayout(10, 10));

    /**
     * Constructor voor speelveld
     */
    public Speelveld() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(500, 500));
        setLevel();
    }

    /**
     * Methode die de game laat herstarten
     */
    public void reset() {
        this.setLevel();
        this.updateVeldObjecten();
    }

    /**
     * Methodie die de game laat afsluiten
     */
    public void aflsuiten() {
    }

    public Speler getSpeler() {
        return speler;
    }

    /**
     * Methode om het speelveld te updaten/refresh
     */

    public Vakje[][] getVakjes() {
        return this.vakjes;
    }

    public Finish getFinish() {
        return finish;
    }

    /**
     * Methode die de Veld Objecten ververst
     */
    public void updateVeldObjecten() {

        veldGrid.removeAll();

        //for loop om de objecten iconen op het veld te krijgen
        for (Vakje[] vakVeld : vakjes) {
            for (Vakje vak : vakVeld) {
                if (vak.bevatObject()) {
                    veldGrid.add(vak.getVeldObject().getIcon());
                } else {
                    veldGrid.add(vak.getIcon());
                }
            }
        }

        veldGrid.revalidate();
        veldGrid.repaint();
    }

    /**
     * Methode om de level op het speelveld te painten
     */
    public void setLevel() {
        level = new Level();
        speler = new Speler(0, 0, this);
        finish = new Finish(9, 9);

        //voeg de grid toe aan de jpanel
        add(veldGrid);

        vakjes = new Vakje[this.level.veldGrootte.width][this.level.veldGrootte.height];

        //for loop om vakjes aan te maken met behulp van de grootte van het veld
        for (int i = 0; i < this.level.veldGrootte.width; i++) {
            for (int j = 0; j < this.level.veldGrootte.height; j++) {
                vakjes[i][j] = new Vakje(i, j);
                vakjes[i][j].setLabel(i, j);
            }
        }

        //zet de speler op een vakje
        vakjes[speler.getRij()][speler.getKolom()].setVeldObject(speler);

        //zet de finish op een vakje
        vakjes[level.finish.getRij()][level.finish.getKolom()].setVeldObject(finish);

        //for loop om de objecten uit de array barricade te maken en te plaatsen op hun vakjes
        for (int[] barricadeHonderd : this.level.getBarricadeHonderd()) {
            vakjes[barricadeHonderd[0]][barricadeHonderd[1]].setVeldObject(new Barricade(100, barricadeHonderd[0], barricadeHonderd[1]));
        }

        for (int[] sleutelHonderd : this.level.getSleutelHonderd()) {
            vakjes[sleutelHonderd[0]][sleutelHonderd[1]].setVeldObject(new Sleutel(100, sleutelHonderd[0], sleutelHonderd[1]));
        }

        for (int[] barricadeTweehonderd : this.level.getBarricadeTweeHonderd()) {
            vakjes[barricadeTweehonderd[0]][barricadeTweehonderd[1]].setVeldObject(new Barricade(200, barricadeTweehonderd[0], barricadeTweehonderd[1]));
        }

        for (int[] sleutelTweehonderd : this.level.getSleutelTweeHonderd()) {
            vakjes[sleutelTweehonderd[0]][sleutelTweehonderd[1]].setVeldObject(new Sleutel(200, sleutelTweehonderd[0], sleutelTweehonderd[1]));
        }

        for (int[] barricadeDriehonderd : this.level.getBarricadeDrieHonderd()) {
            vakjes[barricadeDriehonderd[0]][barricadeDriehonderd[1]].setVeldObject(new Barricade(300, barricadeDriehonderd[0], barricadeDriehonderd[1]));
        }

        for (int[] sleutelDriehonderd : this.level.getSleutelDrieHonderd()) {
            vakjes[sleutelDriehonderd[0]][sleutelDriehonderd[1]].setVeldObject(new Sleutel(300, sleutelDriehonderd[0], sleutelDriehonderd[1]));
        }

        //for loop om object muur op de vakjes te plaatsen

        for (int[] muren : this.level.getMuren()) {
            vakjes[muren[0]][muren[1]].setVeldObject(new Muur(muren[0], muren[1]));
        }
    }
}