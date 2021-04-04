package lambton;


import lambton.employee.PartTime;
import lambton.utils.Color;
import lambton.utils.Gender;
import lambton.employee.FullTime;
import lambton.vehicle.Car;

public class CollegeSystem {
    public static void main(String[] args){
        /*Create two employees
        1- Full time without vehicle
        2-Part time with car
        */

        FullTime fullTimeEmployee = new FullTime(12345,
                "Pritesh",
                "Patel",
                Gender.MALE,
                null,
                1000,
                "HR",
                12);
        fullTimeEmployee.display();
        Car car1 = new Car("ASDF34","TESLA",true, Color.BLACK);
        PartTime partTimeEmployee = new PartTime(12345,
                "Yukti",
                "Saluja",
                Gender.FEMALE,
                car1,
                1000,
                "Accounts",
                20,
                15);
        partTimeEmployee.display();

        /* Create two students
        1- Full time with car
        2- Part time with Motorcycle
         */
        lambton.student.FullTime fullTimeStudent = new lambton.student.FullTime(45673,
                "Yukti",
                "Saluja",
                Gender.FEMALE,
                new Car("YUKT123","TESLA",true,Color.WHITE),
                "LCIT",
                "CSAT",
                "PASS",
                5);
        fullTimeStudent.display();

    }
}
