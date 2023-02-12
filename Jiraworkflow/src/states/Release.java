package states;

public class Release extends State {

    public Release() {
        super();
        stateName = "Релиз";
    }

    @Override
    public Release getStateName() {
        super.getStateName();
        return this;
    }
}