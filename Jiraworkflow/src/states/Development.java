package states;

public class Development extends State {

    public Development() {
        super();
        stateName = "Разработка";
    }

    public Analysis goToAnalysis() {
        return new Analysis();
    }

    public Testing goToTesting() {
        return new Testing();
    }

    public Cancel goToCancel() {
        return new Cancel();
    }

    @Override
    public Development getStateName() {
        super.getStateName();
        return this;
    }
}