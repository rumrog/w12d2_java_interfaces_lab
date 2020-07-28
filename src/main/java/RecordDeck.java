public class RecordDeck extends Component implements IRecordDeck{

  public RecordDeck(String make, String model, int volume) {
    super(make, model, volume);
  }

  public int recordSpeed(int speed) {
    return speed;
  }
}
