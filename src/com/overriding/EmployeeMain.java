package com.overriding;

public class EmployeeMain
{

    public static void main(String args[])
    {
        Employee employee = new Employee();
        employee.show();
        //
        Employee employee1 = new EmployeeChild();
        employee1.show();

        employee.showR1();
        employee1.showR1();
    }
}
