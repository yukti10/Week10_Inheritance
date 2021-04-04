package lambton.student;

import lambton.utils.Gender;
import lambton.vehicle.Vehicle;

public class FullTime extends student{

    int noWeeklyClasses;

    public FullTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, String collegeName, String courseName, String result, int noWeeklyClasses) {
        super(id, firstName, lastName, gender, vehicle, collegeName, courseName, result);
        this.noWeeklyClasses = noWeeklyClasses;
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

        System.out.println("Student number of classes per week:"+this.getNoWeeklyClasses());
        if (this.getVehicle()==null){
            System.out.println("Student do not have vehicle");
        }
        else {
            this.getVehicle().display();
        }
        System.out.println("===========================================================================");

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
