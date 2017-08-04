import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;


public class InstrumentTest {

  Piano piano;


  @Before
  public void before() {
    piano = new Piano("Dongbei", "Plastic", "Electric", "Black", 2602);
  }

  @Test
  public void canGetMake() {
    assertEquals("Dongbei", piano.getMake());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("Plastic", piano.getMaterial());
  }

  @Test
  public void canGetType() {
    assertEquals("Electric", piano.getType());
  }

  @Test
  public void canGetColour() {
    assertEquals("Black", piano.getColour());
  }

}