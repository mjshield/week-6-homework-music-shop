import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;


public class TrumpetValveTest {

  TrumpetValve trumpetValve;


  @Before
  public void before() {
    trumpetValve = new TrumpetValve("Trumpet valve", 5.00, 12.49);
  }

  @Test
  public void canGetDescription() {
    assertEquals("Trumpet valve", trumpetValve.getDescription());
  }

  @Test
  public void canGetBuyPrice() {
    assertEquals(5.00, trumpetValve.getBuyPrice(), 0.0001);
  }

  @Test
  public void canGetSellPrice() {
    assertEquals(12.49, trumpetValve.getSellPrice(), 0.0001);
  }

  @Test
  public void canGetMarkup() {
    assertEquals(7.49, trumpetValve.calculateMarkup(), 0.0001);
  }

}