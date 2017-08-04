package music_management;


public class Trumpet extends Instrument{

  private int valves;


 public Trumpet(String make, String material, String type, String colour, int valves) {
  super(make, material, type, colour);
  this.valves = valves;
 }

 public int getValves() {
  return this.valves;
 }

 public String play() {
  return "Bwoop!";
 }

}