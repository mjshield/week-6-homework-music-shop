package music_management;

public class Guitar extends Instrument {

  private int strings;


 public Guitar(String make, String material, String type, String colour, int strings) {
  super(make, material, type, colour);
  this.strings = strings;
 }

 public int getStrings() {
  return this.strings;
 }

 public String play() {
  return "Twang!";
 }

}