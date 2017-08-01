package com.example.admin.firstdaytest;

import java.util.ArrayList;

/**
 * Created by Admin on 8/1/2017.
 */

public class CodingTest {
    public static void main(String[] args) {
        //Problem one
        //if number divisible by 3 then print "Fizz"
        //if number is divisible by 5 print out "Buzz"
        //if by both print out "FizzBuzz"
        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        //Problem 2
        //Print out the duplicate strings in a arraylist of strings
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("B");
        stringArrayList.add("E");
    }
    public void printFizzBuzz(ArryList<Integer> numbers){
        for(int i=0;i<=numbers.length();i++) {
            if (numbers )
                System.out.println("This number"+numbers+" FizzBuzz");
            if(numbers)
                System.out.println("This number"+numbers+" Fizz");
            if(numbers)
                System.out.println("This number"+numbers+"Buzz");
        }
    }

}
