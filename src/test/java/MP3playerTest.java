import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MP3playerTest {

    Stereo mp3player;

    @Before
    public void before(){
        mp3player = new MP3player("Apple", "iPod", 80, "Ronan's iPod");
    }

    @Test
    public void canConnect() {
      assertEquals("Ronan's iPod", mp3player.connect(mp3player));
    }
}
