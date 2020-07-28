import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComponentTest {

    Component cdplayer;
    Component radio;
    Component recordDeck;

    @Before
    public void before(){
      cdplayer = new CDplayer("Sony", "X1", 100);
      radio = new Radio("Sony", "R8", 100);
      recordDeck = new RecordDeck("Panasonic", "X10", 110);
    }

    @Test
    public void canCheckNumberOfsCDs(){
        assertEquals(10, ((CDplayer) cdplayer).numberOfCDs(10));
    }

    @Test
    public void canTune(){
        assertEquals("BBC Scotland", ((Radio) radio).tune("BBC Scotland"));
    }

    @Test
    public void hasSpeed(){
        assertEquals(20, ((RecordDeck) recordDeck).recordSpeed(20));
    }


}
