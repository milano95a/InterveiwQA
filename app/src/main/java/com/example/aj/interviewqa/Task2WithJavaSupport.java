package com.example.aj.interviewqa;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task2WithJavaSupport {

//    First array have numbers: 4, 5, 98, 45, 67, 34, 35, 54, 21, 45, 73, 62
//    Second array contains numbers : 6, 45, 54, 29, 32, 21, 87, 21, 34
//    a. Please write a function that receives those two arrays and
//    returns an array of the numbers that can be found in both input arrays.
//    b. Found the minimum and maximum in this common numbers array.


    public static Integer[] makeCommonArray(Integer[] a, Integer[] b){
        Set<Integer> aa = new HashSet<>(Arrays.asList(a));
        Set<Integer> bb = new HashSet<>(Arrays.asList(b));
        aa.retainAll(bb);
        return aa.toArray(new Integer[aa.size()]);
    }

    public static Integer findMax(Integer[] a){
        Collections.sort(Arrays.asList(a));
        int lastIndex = a.length -1;
        return a[lastIndex];
    }

    public static Integer findMin(Integer[] a){
        Collections.sort(Arrays.asList(a));
        return a[0];
    }

}
