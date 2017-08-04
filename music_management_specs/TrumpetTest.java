import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;


public class TrumpetTest {

  Trumpet trumpet;


  @Before
  public void before() {
    trumpet = new Trumpet(3);
  }

  @Test
  public void canGetValves() {
    assertEquals(3, trumpet.getValves());
  }

  @Test
  public void canPlay() {
    assertEquals("Bwoop!", trumpet.play());
  }

}