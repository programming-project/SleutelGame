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
        speelveld.getSpeler().lopen(1,"O");
        assertEquals(1,speelveld.getSpeler().getKolom());
    }
    @Test
    public void lopenBeneden() {
        speelveld.getSpeler().lopen(1,"Z");
        assertEquals(1,speelveld.getSpeler().getRij());
    }

    @Test
    public void testStartpositieSpelerKolom(){
        assertEquals(0, speelveld.getSpeler().getKolom());
    }
    @Test
    public void testStartpositieSpelerRij(){
        assertEquals(0, speelveld.getSpeler().getRij());
    }

    @Test
    public void checkVeldObject() {
    }

    @Test
    public void sleutelPakken() {
    }

    @Test
    public void setZak() {
    }

    @Test
    public void getZak() {
    }

    @Test
    public void setRij() {
    }

    @Test
    public void setKolom() {
    }
}