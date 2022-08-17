package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamPractice
{
    private static List<String> listOfString = Arrays.asList("Java", "Spring boot", "hibernate", "jpa", "docker", "kubernetes", "kafka");
    private static List<Integer> listOfInteger = Arrays.asList(10, 20, 500, 150, -15, 50, 100, -15, -2, -3, 20, 25,75,50);

    private static void getCoursesWithAtleastFourCharacters()
    {
        listOfString.stream().filter(courses -> courses.length() > 4)
                .forEach(System.out::println);
    }

    private static void getCubesOfOddNumber()
    {
        listOfInteger.stream()
                .filter(getOddNumber())
                .map(getForEach())
                .forEach(System.out::println);
    }

    private static Function<Integer, Integer> getForEach() {
        return oddNumber -> oddNumber * oddNumber * oddNumber;
    }

    private static Predicate<Integer> getOddNumber() {
        return oddNumber -> oddNumber % 2 == 1;
    }

    public static void main(String[] args) {
        //StreamPractice.getCoursesWithAtleastFourCharacters();
        StreamPractice.getCubesOfOddNumber();
    }
}
