package com.overriding;

public class EmployeeChild extends Employee
{
    @Override
    public void show()
    {
        System.out.println("Emp child");
    }

    /**
     * R1 overriding rule 1 access modifiers
     */
    private void showR1Private()
    {
        System.out.println("Emp child");
    }

    @Override
    public void showR1()
    {
        System.out.println("Emp child R1");
    }
}
