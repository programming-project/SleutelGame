import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpelerTest {

    Speelveld speelveld = new Speelveld();


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void lopenRechts() {
        speelveld.getSpeler().setRij(1);
        speelveld.getSpeler().lopen(1, "O");
        assertEquals(1, speelveld.getSpeler().getKolom());
    }

    @Test
    public void lopenBeneden() {
        speelveld.getSpeler().lopen(1, "Z");
        assertEquals(1, speelveld.getSpeler().getRij());
    }

    @Test
    public void lopenLinks() {
        speelveld.getSpeler().setRij(1);
        speelveld.getSpeler().setKolom(1);
        speelveld.getSpeler().lopen(-1, "W");
        assertEquals(0, speelveld.getSpeler().getKolom());
    }

    @Test
    public void lopenBoven() {
        speelveld.getSpeler().setRij(2);
        speelveld.getSpeler().lopen(-1, "N");
        assertEquals(1, speelveld.getSpeler().getRij());
    }

    @Test
    public void testStartpositieSpelerKolom() {
        assertEquals(0, speelveld.getSpeler().getKolom());
    }

    @Test
    public void testStartpositieSpelerRij() {
        assertEquals(0, speelveld.getSpeler().getRij());
    }

    @Test
    public void checkVeldObject() {
        speelveld.getSpeler().checkVeldObject(1,"Z");
    }

    @Test
    public void sleutelPakken() {
        speelveld.getSpeler().setRij(1);
        speelveld.getSpeler().setKolom(3);
        speelveld.getSpeler().lopen(1, "O");
        assertNotNull(speelveld.getSpeler().getZak());
    }

    @Test
    public void setZak() {
        speelveld.getSpeler().setZak(new Sleutel(100, 0, 0));
        assertNotNull(speelveld.getSpeler().getZak());
    }


    @Test
    public void setRijEnKolom() {
        speelveld.getSpeler().setRij(1);
        speelveld.getSpeler().setKolom(1);
        assertEquals(1, speelveld.getSpeler().getRij());
        assertEquals(1, speelveld.getSpeler().getKolom());
    }
}
