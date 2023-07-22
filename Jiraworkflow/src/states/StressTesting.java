package states;

public class StressTesting extends State {

    public StressTesting() {
        super();
        stateName = "Стресс тестирование";
    }

    public Development goToDevelopment() {
        return new Development();
    }

    public Release goToRelease() {
        return new Release();
    }

    public Cancel goToCancel() {
        return new Cancel();
    }

    @Override
    public StressTesting getStateName() {
        super.getStateName();
        return this;
    }
}
