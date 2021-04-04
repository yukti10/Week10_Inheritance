package lambton.employee;

import lambton.utils.Gender;
import lambton.base.Person;
import lambton.vehicle.Vehicle;

public abstract class Employee  extends Person {
   double baseSalary;

    public Employee(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, double totalSalary) {
        super(id, firstName, lastName, gender, vehicle);
        this.baseSalary = totalSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public abstract double calculateTotalSalary();
}
