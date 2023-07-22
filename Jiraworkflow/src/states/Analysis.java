package states;

public class Analysis extends State {

    public Analysis() {
        super();
        stateName = "Аналитика";
    }

    public Development goToDevelopment() {
        return new Development();
    }

    public Cancel goToCancel() {
        return new Cancel();
    }

    @Override
    public Analysis getStateName() {
        super.getStateName();
        return this;
    }
}
