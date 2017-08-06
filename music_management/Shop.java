package music_management;
import behaviors.*;
import java.util.*;


public class Shop{

  private ArrayList<Sellable> stock;

  public Shop(){
    this.stock = new ArrayList<Sellable>();
  }

  public int stockCount(){
    return this.stock.size();
  }

  public void addStock(Sellable item){
    this.stock.add(item);
  }

  public Sellable removeStock(){
    if(stockCount() > 0){
      return stock.remove(0);
    }
    return null;
  }

}