import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;


public class PianoTest {

  Piano piano;


  @Before
  public void before() {
    piano = new Piano("Dongbei", "Plastic", "Electric", "Black", 2602);
  }

  @Test
  public void canGetTensileStrength() {
    assertEquals(2602, piano.getTensileStrength());
  }

  @Test
  public void canPlay() {
    assertEquals("Bing!", piano.play());
  }

}