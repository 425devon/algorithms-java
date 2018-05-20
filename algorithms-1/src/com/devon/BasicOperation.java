package com.devon;

import java.util.ArrayList;

public class BasicOperation {
    public BasicOperation() {
    }
    //print all the numbers 1 -255
    public void countTo(int number){
        for(int i = 1; i <= number; i++){
            System.out.println(i);
        }
    }

    //print all the odd numbers from 1 to 1000
    public void countOdd(int number){
        for(int i = 1; i <= number; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    //print the sum of all the odd numbers from 1 to 5000
    public long printSumOfOdd(int number){
        long sum = 0l;
        for(int i = 1; i <= number; i++){
            if(i % 2 != 0){ sum += i; }
        }
        System.out.println(sum);
        return sum;
    }

    //iterate over array and print values
    public void printArray(int intArray[]){
        for(int item : intArray ){
            System.out.println(item);
        }
    }

    //Find Max value in array
    public int maxValueInArray(int intArray[]){
        int max = 0;
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] > max){
                max = intArray[i];
            }
        }
        System.out.printf("The maximum value in this array is %d",max);
        return max;
    }

    //Find the average of the values in an array
    public double findAverageValueOfArray(int intArray[]){
        double sum = 0;
        double avg = 0;
        for(int number : intArray){
            sum += number;
        }
        avg = (sum / (intArray.length));
        System.out.printf("The average of the values in the array is: %.2f", avg);
        return avg;
    }
    //Create an array of odd numbers 1-255
    public ArrayList<Integer> createOddArray(int rangeStart, int rangeEnd){
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        for(int i = rangeStart; i <= rangeEnd; i++){
            if(i % 2 != 0){ oddArray.add(i); }
        }
        System.out.println(oddArray);
        return oddArray;
    }

    //return all values in array greater than y
    public ArrayList<Integer> greaterThanY(int intArray[], int y){
        ArrayList<Integer> greaterThan = new ArrayList<Integer>();
        for(int number : intArray){
            if(number > y){
                greaterThan.add(number);
            }
        }
        System.out.println(greaterThan);
        return greaterThan;
    }

    //Square all values in an array
    public int[] squareArrayValues(int intArray[]){
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = intArray[i] * intArray[i];
            System.out.println(intArray[i]);
        }
        return intArray;
    }

    //replace negative values in array with 0
    public int[] replaceNegativeValues(int intArray[]){
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] < 0){
                intArray[i] = 0;
            }
            System.out.println(intArray[i]);
        }
        return intArray;
    }

    //Find the min, max, and average of an array
    public String arrayMinMaxAvg(int intArray[]){
        int min = intArray[0];
        int max = intArray[0];
        int sum = 0;
        double avg = 0;
        for(int number : intArray){
            if(number < min){ min = number; }
            if(number > max){ max = number; }
            sum += number;
        }
        avg = (sum / intArray.length);
        String result = String.format("The minumum value is: %d, \n" +
                "The maximum value is: %d \n" +
                "The average is: %.2f", min, max, avg);
        System.out.println(result);
        return result;
    }

    //Given an Array [1,5,10,7,-2]) should become [5,10,7,-2, 0]
    public int[] shiftByOne(int intArray[]){
        int first = intArray[0];
        for(int i = 0; i < intArray.length-1; i++){
            intArray[i] = intArray[i+1];
        }
        intArray[intArray.length-1] = first;
        for(int number : intArray){
            System.out.println(number);
        }
        return intArray;
    }

    //takes an array of numbers and replaces any number that's negative to a string called 'Dojo'
    public Object[] dojofyNegatives(int intArray[]){
        Object[] result = new Object[intArray.length];
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] < 0){
                result[i] = "dojo";
            }else {
                result[i] = intArray[i];
            }
        }
        for(Object item : result){
            System.out.println(item);
        }
        return result;
    }

    //create an array of random values between 0 and 100
    public int[] createRandomArray(int length){
        int[] randomArray = new int[length];
        for(int i = 0; i < length; i++){
            randomArray[i] = (int) (Math.random() * 99) + 1;
        }
        for(int number : randomArray){
            System.out.println(number);
        }
        return randomArray;
    }

    //reverse and array
    public int[] reverseArray(int intArray[]){
        for(int i = 0; i < (intArray.length / 2); i ++){
            int temp = intArray[i];
            intArray[i] = intArray[(intArray.length - 1) - i];
            intArray[(intArray.length - 1) - i] = temp;
        }
        for(int number : intArray){
            System.out.println(number);
        }
        return intArray;
    }
}
