package music_management;
import behaviors.*;

abstract class Instrument implements Playable{
  protected String make;
  protected String material;
  protected String type;
  protected String colour;

  public Instrument(String make, String material, String type, String colour) {
      this.make = make;
      this.material = material;
      this.type = type;
      this.colour = colour;
  }

  public String getMake() {
    return this.make;
  }

  public String getMaterial() {
    return this.material;
  }

  public String getType() {
    return this.type;
  }

  public String getColour() {
    return this.colour;
  }

}