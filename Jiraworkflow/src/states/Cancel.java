package states;

public class Cancel extends State {

    public Cancel() {
        super();
        stateName = "Отмена";
    }

    @Override
    public Cancel getStateName() {
        super.getStateName();
        return this;
    }
}