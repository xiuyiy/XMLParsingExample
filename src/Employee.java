/**
 * Created by xiuyi on 7/25/2016.
 */
public class Employee {
    String id;
    String firstName;
    String lastName;
    String location;

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
