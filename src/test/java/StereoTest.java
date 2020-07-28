import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;

    @Before
    public void before(){
        stereo = new Stereo("Pioneer", "Z59", 1000, "Noura's Stereo");
    }

    @Test
    public void canConnect(){
        assertEquals("Noura's Stereo", stereo.connect(stereo));
    }

}
