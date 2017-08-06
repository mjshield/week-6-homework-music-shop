import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;


public class GuitarTest {

  Guitar guitar;


  @Before
  public void before() {
    guitar = new Guitar("Yamaha", "Wood", "Acoustic", "Red", "Guitar", 5, 100.50, 189.99);
  }

  @Test
  public void canGetDescription() {
    assertEquals("Guitar", guitar.getDescription());
  }

  @Test
  public void canGetBuyPrice() {
    assertEquals(100.50, guitar.getBuyPrice(), 0.0001);
  }

  @Test
  public void canGetSellPrice() {
    assertEquals(189.99, guitar.getSellPrice(), 0.0001);
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