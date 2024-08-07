public class RemoteControl {
    private Command cmd;
    public void setCmd(Command cmd){
        this.cmd=cmd;

    }

    public void pressButton(){
        cmd.execute();
    }
}
