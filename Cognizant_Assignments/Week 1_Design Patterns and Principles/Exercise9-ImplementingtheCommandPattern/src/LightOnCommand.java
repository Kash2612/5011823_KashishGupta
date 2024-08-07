public class LightOnCommand implements Command{
    private Light lit;
    public LightOnCommand(Light lit){
        this.lit=lit;

    }
    @Override
    public void execute(){
        lit.turnOn();

    }


}
