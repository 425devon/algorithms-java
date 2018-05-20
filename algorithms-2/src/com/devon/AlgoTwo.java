package com.devon;

public class AlgoTwo {
    public AlgoTwo() {
    }
    public int iterativeSum(int number){
        int sum = 0;
        for(int i = 0; i <= number; i++){
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}
