package music_management;
import behaviors.*;


public class Guitar extends Instrument implements Sellable {

  private String description;
  private int strings;
  private double buyPrice;
  private double sellPrice;


  public Guitar(String make, String material, String type, String colour, String description, int strings, double buyPrice, double sellPrice) {
    super(make, material, type, colour);
    this.description = description;
    this.strings = strings;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public String getDescription() {
    return this.description;
  }

  public int getStrings() {
    return this.strings;
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

  public String play() {
    return "Twang!";
  }

}