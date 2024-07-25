package designpatterns.command;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        TV tv = new TV();
        Device stereo = new Stereo();
        ChangeChannelCommand changeTvChannelCommand = new ChangeChannelCommand(tv);
        TurnOnCommand turnOnTvCommand = new TurnOnCommand(tv);
        TurnOffCommand turnOffTvCommand = new TurnOffCommand(tv);
        TurnOnCommand turnOnStereoCommand = new TurnOnCommand(stereo);
        TurnOffCommand turnOffStereoCommand = new TurnOffCommand(stereo);
        remoteControl.setCommand(turnOnTvCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(changeTvChannelCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(turnOffTvCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(turnOnStereoCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(turnOffStereoCommand);
    }
}
