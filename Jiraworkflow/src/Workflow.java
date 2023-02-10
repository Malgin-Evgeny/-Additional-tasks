public class Workflow {

    ProgramState status;

    public void setStatus(ProgramState status) {
        this.status = status;
    }

    public void changeStatus(){
        if(status instanceof Analysis){
          setStatus(new Development());
        } else if(status instanceof Development){
            setStatus(new Testing());
        } else if(status instanceof Testing){
            setStatus(new Release());
        } else if(status instanceof Release){
            setStatus(new Analysis());
        }
    }

    public void offchangeStatus() {
        if (status instanceof Testing) {
            setStatus(new Development());
        }
    }

    public void offchangeRelise(){
        if (status instanceof Release) {
            setStatus(new Analysis());
        }
    }

    public void changeState(){
        status.сhangeState();
    }
}
