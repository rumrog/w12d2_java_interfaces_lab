public class MP3player extends Stereo implements IConnect {

    public MP3player(String make, String model, int volume, String name){
        super(make, model, volume, name);
    }
    public String connect(Stereo stereo){
        return stereo.name;
    }
}
