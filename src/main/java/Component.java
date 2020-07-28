public abstract class Component {

  String make;
  String model;
  int volume;


  public Component(String make, String model, int volume) {
    this.make = make;
    this.model = model;
    this.volume = volume;
  }

    public String getMake() {
      return make;
    }

    public String getModel() {
      return model;
    }

    public int getVolume() {
      return volume;
    }


    public void raiseVolume(int amount){
        if (amount >= 0) {
            this.volume += amount;
        }
    }

    public void lowerVolume(int amount){
        if (amount >= 0) {
            this.volume -= amount;
        }
    }



}
