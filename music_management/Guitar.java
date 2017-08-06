package music_management;
import behaviors.*;


public class Guitar extends Instrument implements Sellable {

  private int strings;
  private double buyPrice;
  private double sellPrice;


 public Guitar(String make, String material, String type, String colour, int strings, double buyPrice, double sellPrice) {
  super(make, material, type, colour);
  this.strings = strings;
  this.buyPrice = buyPrice;
  this.sellPrice = sellPrice;
 }

 public int getStrings() {
  return this.strings;
 }

 public int getBuyPrice() {
  return this.strings;
 }

 public int getSellPrice() {
  return this.strings;
 }

 public double calculateMarkup() {
  double result = sellPrice - buyPrice;
  return result;
 }

 public String play() {
  return "Twang!";
 }

}