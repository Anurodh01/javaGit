package designpatterns.command;

public class AdjustVolumeCommand implements Command{
    private Stereo stereo;
    public AdjustVolumeCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        this.stereo.adjustVolume();
    }
}
