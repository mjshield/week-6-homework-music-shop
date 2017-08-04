import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;


public class GuitarTest {

  Guitar guitar;


  @Before
  public void before() {
    guitar = new Guitar(5);
  }

  @Test
  public void canGetStrings() {
    assertEquals(5, guitar.getStrings());
  }

  @Test
  public void canPlay() {
    assertEquals("Twang!", guitar.play());
  }

}