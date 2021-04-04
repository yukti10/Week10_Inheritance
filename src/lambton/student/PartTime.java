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
    public void display() {
        System.out.println("Student type:"+this.getType());
        System.out.println("Student ID:"+this.getId());
        System.out.println("Student First Name:"+this.getFirstName());
        System.out.println("Student Last Name:" +this.getLastName());
        System.out.println("Student Gender:"+this.getGender());
        System.out.println("College Name:"+this.getCollegeName());
        System.out.println("Course Name:"+this.getCourseName());
        System.out.println("Student result"+this.getResult());

        System.out.println("Student attendance:"+this.getAttendance());

        if (this.getVehicle()==null){
            System.out.println("Student do not have vehicle");
        }
        else {
            this.getVehicle().display();
        }
        System.out.println("===========================================================================");
    }

    @Override
    public String getType() {
        return "full Time Student";
    }
}
