import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpelerTest {

    Speelveld speelveld = new Speelveld();


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testLopenRechts() {
        speelveld.getSpeler().setRij(1);
        speelveld.getSpeler().lopen(1, "O");
        assertEquals(1, speelveld.getSpeler().getKolom());
    }

    @Test
    public void testLopenBeneden() {
        speelveld.getSpeler().lopen(1, "Z");
        assertEquals(1, speelveld.getSpeler().getRij());
    }

    @Test
    public void testLopenLinks() {
        speelveld.getSpeler().setRij(1);
        speelveld.getSpeler().setKolom(1);
        speelveld.getSpeler().lopen(-1, "W");
        assertEquals(0, speelveld.getSpeler().getKolom());
    }

    @Test
    public void testLopenBoven() {
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
    public void testCheckVeldObjectVakjeOnder() {
        assertEquals(true ,speelveld.getSpeler().checkVeldObject(1,"Z"));
    }

    @Test
    public void testCheckVeldObjectMuurRechts() {
        assertEquals(false ,speelveld.getSpeler().checkVeldObject(1,"O"));
    }

    @Test
    public void testCheckVeldObjectSleutelRechts() {
        speelveld.getSpeler().setRij(1);
        speelveld.getSpeler().setKolom(3);
        assertEquals(true,speelveld.getSpeler().checkVeldObject(1,"O"));
    }

    @Test
    public void testSleutelPakkenRechts() {
        speelveld.getSpeler().setRij(1);
        speelveld.getSpeler().setKolom(3);
        speelveld.getSpeler().lopen(1, "O");
        assertNotNull(speelveld.getSpeler().getZak());
    }

    @Test
    public void testSleutelPakkenOnder() {
        speelveld.getSpeler().setRij(0);
        speelveld.getSpeler().setKolom(4);
        speelveld.getSpeler().lopen(1, "Z");
        assertNotNull(speelveld.getSpeler().getZak());
    }

    @Test
    public void testSleutelPakkenLinks() {
        speelveld.getSpeler().setRij(1);
        speelveld.getSpeler().setKolom(6);
        speelveld.getSpeler().lopen(-1, "W");
        assertNotNull(speelveld.getSpeler().getZak());
    }
    @Test
    public void testSleutelPakkenBoven() {
        speelveld.getSpeler().setRij(2);
        speelveld.getSpeler().setKolom(4);
        speelveld.getSpeler().lopen(-1, "N");
        assertNotNull(speelveld.getSpeler().getZak());
    }

    @Test
    public void testSetZak() {
        speelveld.getSpeler().setZak(new Sleutel(100, 0, 0));
        assertNotNull(speelveld.getSpeler().getZak());
    }

    @Test
    public void testCheckVeldObjectFinishOnder() {
        speelveld.getSpeler().setRij(8);
        speelveld.getSpeler().setKolom(9);
        assertEquals(false,speelveld.getSpeler().checkVeldObject(1,"Z"));
    }

    @Test
    public void testCheckVeldObjectFinishRechts() {
        speelveld.getSpeler().setRij(9);
        speelveld.getSpeler().setKolom(8);
        assertEquals(false,speelveld.getSpeler().checkVeldObject(1,"O"));
    }

    @Test
    public void testSetRijEnKolom() {
        speelveld.getSpeler().setRij(1);
        speelveld.getSpeler().setKolom(1);
        assertEquals(1, speelveld.getSpeler().getRij());
        assertEquals(1, speelveld.getSpeler().getKolom());
    }
}
