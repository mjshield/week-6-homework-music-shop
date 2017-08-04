package music_management;

public class Piano {

  private int tensileStrength;


 public Piano(int tensileStrength) {
  this.tensileStrength = tensileStrength;
 }

 public int getTensileStrength() {
  return this.tensileStrength;
 }

 public String play() {
  return "Bing!";
 }

}