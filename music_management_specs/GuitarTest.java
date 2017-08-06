import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;


public class GuitarTest {

  Guitar guitar;


  @Before
  public void before() {
    guitar = new Guitar("Yamaha", "Wood", "Acoustic", "Red", 5, 100.50, 189.99);
  }

  @Test
  public void canGetStrings() {
    assertEquals(5, guitar.getStrings());
  }

  @Test
  public void canPlay() {
    assertEquals("Twang!", guitar.play());
  }

  @Test
  public void canGetMarkup() {
    assertEquals(89.49, guitar.calculateMarkup(), 0.0001);
  }

}