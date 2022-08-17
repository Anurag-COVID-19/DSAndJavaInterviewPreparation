package com.streamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo
{

    private static List<String> string = Arrays.asList("abc", "", "avdgs", "agvs", "");

    //count empty string example
    static{
        long count = string.stream()
                .filter(x -> x.isEmpty())
                .count();
        System.out.println("Empty String present :: "+ count);
    }

    //removing empty string from the list example
    static{
        List<String> newString = string.stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toList());
        System.out.println("List without empty string  :: "+ newString);
    }

    //problem: 1

    /**
     * Find the first element of a Stream in Java
     * Input: Stream = {“Geek_First”, “Geek_2”, “Geek_3”, “Geek_4”, “Geek_Last”}
     * Output: Geek_First
     *
     * Input: Stream = {1, 2, 3, 4, 5, 6, 7}
     * Output: 1
     * @param args
     */
    private static Stream<String> stream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
    static {
        //System.out.println("Find First Type 1 ::  "+ stream.findFirst().orElse(null));
        System.out.println("Find First Type 2 :: "+ stream.reduce((first, second) -> first).orElse(null));
    }

    //Find the last element of a Stream in Java
    private static Stream<String> newStream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
    static {
        System.out.println("Find Last :: "+ newStream.reduce((first, second) -> second).orElse(null));
    }

    /**
     * How to find duplicate elements in a Stream in Java
     * Input: Stream = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34}
     * Output: [59, 13]
     * Explanation:
     * The only duplicate elements in the given stream are 59 and 13.
     *
     * Input: Stream = {5, 13, 4, 21, 27, 2, 59, 34}
     * Output: []
     * Explanation:
     * There are no duplicate elements in the given stream, hence the output is empty.
     * @param args
     */
    private static Stream<Integer> integerStream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
    static {
        Set<Integer> duplicateValue = new HashSet<>();
        System.out.println("Duplicate values :: "+ integerStream.filter(integer -> !duplicateValue.add(integer))
                .collect(Collectors.toSet()));
    }

    private static List<Integer> integerStreamType2 = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
    static {
        Set<Integer> set = new HashSet<>();
        System.out.println("Duplicate values :: "+ integerStreamType2.stream()
                .filter(integer -> Collections.frequency(integerStreamType2, integer) > 1)
                .collect(Collectors.toSet()));
    }

    /**
     * Count occurrence of a given character in a string using Stream API in Java
     * Input: str = "geeksforgeeks", c = 'e'
     * Output: 4
     * 'e' appears four times in str.
     *
     * Input: str = "abccdefgaa", c = 'a'
     * Output: 3
     * 'a' appears three times in str.
     * @param args
     */
    private static String str = "geeksforgeeks";
    static {
        char charcterForLookUp = 'g';
        long count  = str.chars().filter(c-> c==charcterForLookUp)
                .count();
        System.out.println("Character occurrence :: "+ count);
    }



    //main function for main thread to execute the code sequence
    public static void main(String args[])
    {

    }
}
