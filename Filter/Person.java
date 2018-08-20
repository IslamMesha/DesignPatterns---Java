/**
 * Person
 */
public class Person {

    private String name;
    private String gender;
    private String militaryStatus;

    public Person(String name, String gender, String militaryStatus) {
        this.name = name;
        this.gender = gender;
        this.militaryStatus = militaryStatus;
    };

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return militaryStatus;
    }
}