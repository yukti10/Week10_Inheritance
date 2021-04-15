package lambton.employee;

import lambton.Exceptions.InvalidSalaryException;
import lambton.utils.Gender;
import lambton.vehicle.Vehicle;

import javax.xml.bind.ValidationException;

public abstract class Faculty extends Employee {//Inheritance
    String department;

    public Faculty(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, double totalSalary, String department) throws  InvalidSalaryException {
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
