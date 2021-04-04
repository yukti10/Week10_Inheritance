package lambton.employee;

import lambton.utils.Gender;
import lambton.vehicle.Vehicle;

public abstract class Faculty extends Employee {
    String department;

    public Faculty(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, double totalSalary, String department) {
        super(id, firstName, lastName, gender, vehicle, totalSalary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
