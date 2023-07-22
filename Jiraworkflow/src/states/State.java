package states;

public abstract class State {

    public String stateName;

    public State(){}

    public State getStateName() {
        System.out.println("Задача находиться в статусе: " + stateName);
        return this;
    }
}
