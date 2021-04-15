package lambton.employee;

import lambton.Exceptions.InvalidSalaryException;
import lambton.utils.Gender;
import lambton.base.Person;
import lambton.vehicle.Vehicle;

import javax.xml.bind.ValidationException;

public abstract class Employee  extends Person {//abstraction
   double baseSalary;

    public Employee(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, double baseSalary) throws InvalidSalaryException{
        super(id, firstName, lastName, gender, vehicle);
        if (InvalidSalaryException.validateSalary(baseSalary)) {
            this.baseSalary = baseSalary;
        }
        else {
            throw new InvalidSalaryException("Invalid Salary: "+ baseSalary);
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) throws InvalidSalaryException {
        if (InvalidSalaryException.validateSalary(baseSalary))  {
            this.baseSalary = baseSalary;
        }
        else {
            throw new InvalidSalaryException("Invalid Salary: "+baseSalary);
        }

    }
    public abstract double calculateTotalSalary();


}
