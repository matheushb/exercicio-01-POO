
public class Pessoa {
    private String firstName;
    private String lastName;
    private int age;
    private String dateOfBirth;

    public Pessoa(String firstName, String lastName, int age, String dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }


    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }


}
