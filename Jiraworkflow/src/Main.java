public class Main {
    public static void main(String[] args) {
        ProgramState status = new Analysis();
        Workflow workflow = new Workflow();

        workflow.setStatus(status);
        workflow.changeStatus();
        workflow.changeStatus();
        workflow.changeStatus();
        workflow.offchangeRelise();
        workflow.changeState();
    }
}