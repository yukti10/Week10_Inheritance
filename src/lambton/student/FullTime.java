package lambton.student;

import lambton.utils.Gender;
import lambton.vehicle.Vehicle;

public class FullTime extends student{

    int noWeeklyClasses;

    public FullTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, String collegeName, String courseName, String result, int noWeeklyClasses) {
        super(id, firstName, lastName, gender, vehicle, collegeName, courseName, result);
        this.noWeeklyClasses = noWeeklyClasses;
    }

    public int getNoWeeklyClasses() {
        return noWeeklyClasses;
    }

    public void setNoWeeklyClasses(int noWeeklyClasses) {
        this.noWeeklyClasses = noWeeklyClasses;
    }

    @Override
    public String getType() {
        return "FullTime";
    }
}
