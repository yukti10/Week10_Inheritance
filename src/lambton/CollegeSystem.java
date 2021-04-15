package lambton;


import lambton.Exceptions.InvalidSalaryException;
import lambton.base.Person;
import lambton.employee.Employee;
import lambton.employee.PartTime;
import lambton.student.student;
import lambton.utils.Color;
import lambton.utils.Gender;
import lambton.employee.FullTime;
import lambton.vehicle.Car;

import java.util.ArrayList;

public class CollegeSystem {

    public static void main(String[] args){
        ArrayList<Person>personArrayList = new ArrayList<>();

        /*Create two employees
        1- Full time without vehicle
        2-Part time with car
        */
        try {
            FullTime fullTimeEmployee = new FullTime(12345,
                    "Pritesh",
                    "Patel",
                    Gender.MALE,
                    null,
                    5000,
                    "HR",
                    12);
            // fullTimeEmployee.display();
            Car car1 = new Car("ASDF34", "TESLA", true, Color.BLACK);
            PartTime partTimeEmployee = new PartTime(12345,
                    "Yukti",
                    "Saluja",
                    Gender.FEMALE,
                    car1,
                    3000,
                    "Accounts",
                    20,
                    15);
            // partTimeEmployee.display();

        /* Create two students
        1- Full time with car
        2- Part time with Motorcycle
         */
            lambton.student.FullTime fullTimeStudent = new lambton.student.FullTime(45673,
                    "Yukti",
                    "Saluja",
                    Gender.FEMALE,
                    new Car("YUKT123", "TESLA", true, Color.WHITE),
                    "LCIT",
                    "CSAT",
                    "PASS",
                    5);
            // fullTimeStudent.display();
            personArrayList.add(fullTimeStudent);
            personArrayList.add(fullTimeEmployee);
            personArrayList.add(partTimeEmployee);

            for (Person p : personArrayList) {
                if (p instanceof student) {
                    System.out.println("This is a student");
                }
                if (p instanceof Employee) {
                    System.out.println("This is an employee");
                }
                p.display();
            }
        }
        catch (InvalidSalaryException ise){
            System.out.println(ise.getMessage());
        }
    }
}
