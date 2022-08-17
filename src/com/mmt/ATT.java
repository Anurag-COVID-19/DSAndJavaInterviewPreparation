package com.mmt;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ATT {

    //write a program to generate and print five random integers between 3 to 60 in sorted order
/*
    public Random getGenerate(int a)
    {
        *//*int lower_bound = 3;
        int upper_bound = 60;*//*
        Random random = new Random();
        //random.nextInt(3);
        random.ints(5, 3, 60);
        return random;
    }*/

    public static void main(String arsp[])
    {
        String[] str = new String[]{"abc", "zyx", "abc"};
        Set<String> newSet = new HashSet<>();
        for(int i = 0; i < str.length; i++)
        {


                newSet.add(str[i]);

        }
        System.out.println(newSet);
        Random random = new Random();
        random.ints(5, 3, 60);
        System.out.println(random);

    }
}
