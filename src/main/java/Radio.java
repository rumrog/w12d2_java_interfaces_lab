public class Radio extends Component implements IRadio {


    public Radio(String make, String model, int volume) {
        super(make, model, volume);
    }

    public String tune(String station){
        return station;
    }
}
