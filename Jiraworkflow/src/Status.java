public class Status {

    String status;

    public void create(){
        status = "Создание проекта";
        System.out.println(status);
    }

    public void inDevelopment(){
        status = "В разработке";
        System.out.println(status);
    }

    public void inTesting(){
        status ="В тестировании";
        System.out.println(status);
    }

    public void onRelease(){
        status = "На релизе";
        System.out.println(status);
    }
}
