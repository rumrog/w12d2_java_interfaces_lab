import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDplayer cdplayer;

    @Before
    public void before(){
        cdplayer = new CDplayer("Sony", "X1", 100);
    }

    @Test
    public void canCheckNumberOfsCDs(){
        assertEquals(10, cdplayer.numberOfCDs(10));
    }
}
