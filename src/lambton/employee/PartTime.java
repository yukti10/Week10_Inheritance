package lambton.employee;

import lambton.Exceptions.InvalidSalaryException;
import lambton.utils.Gender;
import lambton.utils.utils;
import lambton.vehicle.Vehicle;

public class PartTime extends Faculty{
    double noHoursWorked;
    double payPerHours;

    @Override
    public double calculateTotalSalary() {
        return this.baseSalary+(this.payPerHours*this.noHoursWorked);
    }

    public PartTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, double baseSalary, String department, double noHoursWorked, double payPerHours)throws InvalidSalaryException {
        super(id, firstName, lastName, gender, vehicle, baseSalary, department);
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
    public void display() {
        System.out.println("Employee type:"+this.getType());
        System.out.println("Employee ID:"+this.getId());
        System.out.println("Employee First Name:"+this.getFirstName());
        System.out.println("Employee Last Name:" +this.getLastName());
        System.out.println("Employee Gender:"+this.getGender());
        System.out.println("Employee Department:"+this.getDepartment());
        System.out.println("Employee hours worked:"+this.getNoHoursWorked());

        System.out.println("Employee pay/hr:"+this.getPayPerHours());
        System.out.println("Employee Total salary"+ utils.currencyFormat(this.calculateTotalSalary()));
        if (this.getVehicle()==null){
            System.out.println("Employee do not have vehicle");
        }
        else {
            this.getVehicle().display();
        }
        System.out.println("============================================================================");

    }

    @Override
    public String getType() {
        return "Part Time Employee";
    }
}
