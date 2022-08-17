package com.overriding;

public class Employee {

    public void show()
    {
        System.out.println("Emp parent");
    }

    /**
     * R1 overriding rule 1 access modifiers
     */
    private void showR1Private()
    {
        System.out.println("Emp parent");
    }

    protected void showR1()
    {
        System.out.println("Emp parent R1");
    }
}
