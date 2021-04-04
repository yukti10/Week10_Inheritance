package lambton.student;

import lambton.base.Person;
import lambton.utils.Gender;
import lambton.vehicle.Vehicle;

public abstract class student extends Person {

    String collegeName;
    String courseName;
    String result;

    public student(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, String collegeName, String courseName, String result) {
        super(id, firstName, lastName, gender, vehicle);
        this.collegeName = collegeName;
        this.courseName = courseName;
        this.result = result;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


}
