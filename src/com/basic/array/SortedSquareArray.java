package com.basic.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedSquareArray
{
    public static void main(String[] args) {

        Integer[] array = new Integer[]{1,2,3,4,5,6,7};
        List<Integer> sortedArrayList = Arrays.asList(array);
        sortedArrayList.stream().sorted().map(element -> element * element).collect(Collectors.toList()).stream()
                .forEach(System.out::println);
    }
}
