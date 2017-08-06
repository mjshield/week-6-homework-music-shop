import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;


public class GuitarStringTest {

  GuitarString guitarString;


  @Before
  public void before() {
    guitarString = new GuitarString("Guitar string", 1.00, 2.99);
  }

  @Test
  public void canGetDescription() {
    assertEquals("Guitar string", guitarString.getDescription());
  }

  @Test
  public void canGetBuyPrice() {
    assertEquals(1.00, guitarString.getBuyPrice(), 0.0001);
  }

  @Test
  public void canGetSellPrice() {
    assertEquals(2.99, guitarString.getSellPrice(), 0.0001);
  }

  @Test
  public void canGetMarkup() {
    assertEquals(1.99, guitarString.calculateMarkup(), 0.0001);
  }

}