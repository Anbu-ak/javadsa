package com.company;

class Solution {
    static String oddEven(int N) {
        if (N % 2 != 0) {
            return "odd";
        }
        if (N % 2 == 0) {
            return "even";
        }
        return "neither odd or even";
    }
    public static void main(String[] args){
        String result= oddEven(2);
        System.out.print(result);

    }
}

