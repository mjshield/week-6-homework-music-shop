package music_management;

public class Piano extends Instrument {

  private int tensileStrength;


 public Piano(String make, String material, String type, String colour, int tensileStrength) {
  super(make, material, type, colour);
  this.tensileStrength = tensileStrength;
 }

 public int getTensileStrength() {
  return this.tensileStrength;
 }

 public String play() {
  return "Bing!";
 }

}