public class TestCommand {
    public static void main(String[] args) {
        Light room=new Light();

        Command litOn=new LightOnCommand(room);
        Command litOff=new LightOffCommand(room);

        RemoteControl rC=new RemoteControl();

        rC.setCmd(litOn);
        rC.pressButton();

        rC.setCmd(litOff);
        rC.pressButton();
    }
}
