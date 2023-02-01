public class Ticket {
// Обязательные поля
    public String firstName;
    public String lastName;
    public String gender;
    public String dateOfBirth;
// Не обязательные поля
    public String middleName;
    public String maritalStatus;

    public Ticket(String firstName, String lastName, String gender, String dateOfBirth,
                  String middleName, String maritalStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.middleName = middleName;
        this.maritalStatus = maritalStatus;
    }

    public void registration() {
        if (firstName.isEmpty() || lastName.isEmpty() || gender.isEmpty() || dateOfBirth.isEmpty())
            System.out.println("Ошибка. Заполните обязательные поля!");
        else System.out.println(firstName + " " + lastName + " " + gender + " "
                + dateOfBirth + " " + middleName + " " + maritalStatus);
        System.out.println("Билет зарегистрирован!");
    }
}


