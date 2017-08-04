package music_management;

public class Guitar {

  private int strings;


 public Guitar(int strings) {
  this.strings = strings;
 }

 public int getStrings() {
  return this.strings;
 }

 public String play() {
  return "Twang!";
 }

}