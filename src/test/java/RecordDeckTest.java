import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void setUp(){
        recordDeck = new RecordDeck("Panasonic", "X10", 110);
    }

    @Test
    public void hasSpeed(){
        assertEquals(20, recordDeck.recordSpeed(20));
    }
}
