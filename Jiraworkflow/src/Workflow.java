/*import states.*;

public class Workflow {

    ProgramState status;

    public void setStatus(ProgramState status) {
        this.status = status;
    }

    public void changeStatus(){
        if(status instanceof Analysis){
          setStatus(new Development());
        } else if(status instanceof Development){
            setStatus(new CodeReview());
        } else if(status instanceof CodeReview){
            setStatus(new Testing());
        } else if(status instanceof Testing){
            setStatus(new Release());
        }
    }

    public void changeStatusDesk() {
        if(status instanceof Development){
            setStatus(new Analysis());
        } else if(status instanceof CodeReview){
            setStatus(new Development());
        } else if(status instanceof Testing){
            setStatus(new CodeReview());
        } else if(status instanceof Release){
            setStatus(new Testing());
        }
    }

    public void changeStatusCancel() {
        if(status instanceof Analysis || status instanceof Development || status instanceof CodeReview || status instanceof Testing) {
            setStatus(new Cancel());
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
}*/
