package states;

public class Testing extends State {

    public Testing() {
        super();
        stateName = "Тестирование";
    }

    public Development goToDevelopment() {
        return new Development();
    }

    public Release goToRelease() {
        return new Release();
    }

    public StressTesting goToStressTesting() {
        return new StressTesting();
    }

    public Cancel goToCancel() {
        return new Cancel();
    }

    @Override
    public Testing getStateName() {
        super.getStateName();
        return this;
    }
}