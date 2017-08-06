import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;
import behaviors.*;

public class ShopTest{
  Shop shop;
  Guitar guitar;
  GuitarString guitarString;
  TrumpetValve trumpetValve;

  @Before
  public void before() {
    shop = new Shop();
    guitar = new Guitar("Yamaha", "Wood", "Acoustic", "Red", "Guitar", 5, 100.50, 189.99);
    guitarString = new GuitarString("Guitar string", 1.00, 2.99);
    trumpetValve = new TrumpetValve("Trumpet valve", 5.00, 12.49);
  }

  @Test
  public void stockStartsEmpty(){
    assertEquals(0, shop.stockCount());
  }

  @Test
  public void canAddStock(){
    shop.addStock(guitar);
    shop.addStock(guitarString);
    shop.addStock(trumpetValve);
    assertEquals(3, shop.stockCount());
  }

  @Test
  public void canRemoveStock(){
    shop.addStock(guitar);
    Sellable sellableItem = shop.removeStock();
    assertNotNull(sellableItem);

  }

}



