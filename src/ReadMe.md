IDisplay(Interface)

Person(id,firstName,lastName,gender(enum),Vehicle)
-Student(collegeName,courseName,result)
    -PartTime(noWeeklyClasses)
    -FullTime(attendance)
-Employee(totalSalary)
    -Faculty(department)
        -PartTime(noHoursWorked,payperHours)
        -FullTime(bonus)

Vehicle(VIN,brand,isInsured)
    -Car(color enum)
    -MotorCycle(noOfSeats)