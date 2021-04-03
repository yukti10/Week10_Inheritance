package lambton.student;

import lambton.utils.Gender;
import lambton.vehicle.Vehicle;

public class PartTime extends student{
    int attendance;

    public PartTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, String collegeName, String courseName, String result, int attendance) {
        super(id, firstName, lastName, gender, vehicle, collegeName, courseName, result);
        this.attendance = attendance;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    @Override
    public String getType() {
        return "full Time Student";
    }
}
