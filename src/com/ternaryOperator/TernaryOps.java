package com.ternaryOperator;

public class TernaryOps extends Employee
{
    public static void main(String args[])
    {
        int n1 = 5, n2 = 10, res = 0;
        System.out.println("min"+n1);
        System.out.println("max"+n2);
        res = (n1 > n2) ? (n1+n2) : (n2-n1);
        System.out.println("O/P:: "+res);

        /*(Employee e) -> { return e.yearsOfExp >= 7 ?
            "Expert": e.yearsOfExp >= 3 ?
                "Intermediate": "Fresher"; }*/
    }
}
