import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void setUp(){
        radio = new Radio("Sony", "R8", 100);
    }

    @Test
    public void canTune(){
        assertEquals("BBC Scotland", radio.tune("BBC Scotland"));
    }
}
