public class LightOffCommand implements Command{
    public Light lit;
    public LightOffCommand(Light lit){
        this.lit=lit;

    }
    @Override
    public void execute(){
        lit.turnOff();
    }
}
