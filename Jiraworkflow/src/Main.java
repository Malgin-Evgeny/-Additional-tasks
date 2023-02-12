import states.Analysis;
import states.Development;
import states.State;

public class Main {
    public static void main(String[] args) {
        Analysis program = new Analysis();

        program.getStateName()
                .goToDevelopment().getStateName()
                .goToTesting().getStateName()
                .goToDevelopment().getStateName()
                .goToTesting().getStateName()
                .goToStressTesting().getStateName()
                .goToRelease().getStateName();



        /*ProgramState status = new Analysis();
        Workflow workflow = new Workflow();

        workflow.setStatus(status);
        workflow.changeStatus();
        workflow.changeState();
        workflow.changeStatus();
        workflow.changeState();
        workflow.changeStatus();
        workflow.changeState();
        workflow.changeStatusDesk();
        workflow.changeState();
        workflow.changeStatusCancel();
        workflow.changeState();*/
    }
}