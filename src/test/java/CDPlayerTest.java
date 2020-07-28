import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDplayer cdplayer;

    @Before
    public void before(){
        cdplayer = new CDplayer();
    }

    @Test
    public void canCheckNumberOfsCDs(){
        assertEquals(10, cdplayer.numberOfCDs(10));
    }
}
