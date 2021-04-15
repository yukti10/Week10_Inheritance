package lambton.employee;

import lambton.Exceptions.InvalidSalaryException;
import lambton.utils.Gender;
import lambton.utils.utils;
import lambton.vehicle.Vehicle;

public class FullTime extends Faculty {
    double bonus;

    @Override//Overriding super class methods
        public double calculateTotalSalary() {
        return this.baseSalary+this.bonus;
    }

    @Override
    public void display() {
        System.out.println("Employee type:"+this.getType());
        System.out.println("Employee ID:"+this.getId());
        System.out.println("Employee First Name:"+this.getFirstName());
        System.out.println("Employee Last Name:" +this.getLastName());
        System.out.println("Employee Gender:"+this.getGender());
        System.out.println("Employee Department:"+this.getDepartment());
        System.out.println("Employee base Salary:"+utils.currencyFormat(this.getBaseSalary()));
        System.out.println("Employee Bonus:"+ utils.currencyFormat(this.getBonus()));
        System.out.println("Employee Total salary:"+utils.currencyFormat(this.calculateTotalSalary()));
        if (this.getVehicle()==null){
            System.out.println("Employee do not have vehicle");
        }
        else {
            this.getVehicle().display();
        }
        System.out.println("============================================================================");
    }

    public FullTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, double baseSalary, String department, double bonus) throws InvalidSalaryException {
        super(id, firstName, lastName, gender, vehicle, baseSalary, department);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getType() {
        return "Full Time employee";
    }
}
