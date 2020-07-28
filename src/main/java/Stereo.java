public class Stereo extends Component implements IRadio, ICDplayer, IRecordDeck {

    private String name;

    public Stereo(String make, String model, int volume, String name){
        super(make, model, volume);
        this.name = name;
    }

    public String tune(String station){
        return station;
    }

    public int recordSpeed(int speed) {
      return speed;
    }

    public int numberOfCDs(int numberOfCDs){
          return numberOfCDs;
    }

    public String playCD(String CDname){
        return CDname;
    }

}
