package lambton.employee;

import lambton.utils.Gender;
import lambton.vehicle.Vehicle;

public class PartTime extends Faculty{
    double noHoursWorked;
    double payPerHours;

    public PartTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, double totalSalary, double noHoursWorked, double payPerHours) {
        super(id, firstName, lastName, gender, vehicle, totalSalary);
        this.noHoursWorked = noHoursWorked;
        this.payPerHours = payPerHours;
    }

    public double getNoHoursWorked() {
        return noHoursWorked;
    }

    public void setNoHoursWorked(double noHoursWorked) {
        this.noHoursWorked = noHoursWorked;
    }

    public double getPayPerHours() {
        return payPerHours;
    }

    public void setPayPerHours(double payPerHours) {
        this.payPerHours = payPerHours;
    }

    @Override
    public String getType() {
        return "Part Time Employee";
    }
}
