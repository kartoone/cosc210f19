/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.briantoone.fun;

/**
 *
 * @author kartoone
 */
public class Probability {
    
    // incusive: start
    // exclusive: stop
    public static int sumIterative(int start, int stop) {
        int total = start;
        for (int i = start + 1; i<stop; i++) {
            total += i;
        }
        return total;
    }

    public static int sum(int start, int stop) {
        return sumHelper(start, stop, start);
    }    

        
    /**
     * iterative implementation of factorial.
     * @param n
     * @return
     */
    public static int factorialIterative(int n) {
        int product = 1;
//        for (; n>0; n--) {
//            product = product*n;
//        }
        while (n>0) {
            product = product * n;
            n--;
        }
//        while (n>0) {
//            product *= n--;
//        }
        return product;
    }
    /**
     * recursive implementation of factorial.
     * base case: n==0, return 1
     * recursive step: n>0, return n*factorial(n-1)
     * @param n
     * @return 
     */
    public static int factorial(int n) {
        if (n>0) {
            return n*factorial(n-1);
        } else {
            return 1;
        }
//        return n>0?n*factorial(n-1):1;
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int sumHelper(int start, int stop, int current) {
        if (current>=stop) {
            return 0;
        } else {
            return current + sumHelper(start, stop, current+1);
        }
    }
}