package com.devon;

public class AlgoTwo {
    public AlgoTwo() {
    }

    //iterative sum
    public int iterativeSum(int number){
        int sum = 0;
        for(int i = 0; i <= number; i++){
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

    //recursive sum
    public int recursiveSum(int num) {
        if(num == 0){ return 0; }
        return num + recursiveSum(--num);
    }

    //iterative factorial
    public int iterativeFactorial(int number){
        int sum = 1;
        for(int i = number; i >= 1; i--){
            sum *= i;
        }
        System.out.println(sum);
        return sum;
    }

    //recursive factorial
    public int recursiveFactorial(int number){
        if(number == 1){ return 1; }
        return number *= recursiveFactorial(--number);
    }

    //iterativeFibonacci
    public int iterativeFibonacci(int number){
        if(number == 0){ return 0; }
        if(number < 3){ return 1; }
        int prev = 1;
        int result = 1;
        for(int i = 3; i <= number; i++){
            int temp = result;
            result = result + prev;
            prev = temp;
        }
        return result;
    }

    //recursive fibonacci
    public int recusriveFibonacci(int number){
        if(number <= 0){ return 0; }
        if(number < 3){ return 1; }
        return (recusriveFibonacci(number -1) + recusriveFibonacci(number - 2));
    }
}
