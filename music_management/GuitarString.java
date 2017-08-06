package music_management;
import behaviors.*;

public class GuitarString implements Sellable {

  private String description;
  private double buyPrice;
  private double sellPrice;

  public GuitarString(String description, double buyPrice, double sellPrice) {
    this.description = description;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public String getDescription() {
   return this.description;
 }

 public double getBuyPrice() {
   return this.buyPrice;
 }

 public double getSellPrice() {
   return this.sellPrice;
 }

 public double calculateMarkup() {
   double result = sellPrice - buyPrice;
   return result;
 }
}