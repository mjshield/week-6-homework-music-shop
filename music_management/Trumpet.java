package music_management;


public class Trumpet {

  private int valves;


 public Trumpet(int valves) {
  this.valves = valves;
 }

 public int getValves() {
  return this.valves;
 }

 public String play() {
  return "Bwoop!";
 }

}