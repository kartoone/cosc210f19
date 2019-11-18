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
public class Addrange {
    public static void main(String[] args) {
        int num1 = 1;   // register t0
        int num2 = 10;  // register t1
        int answer = 0; // register t2
        // int i=num1;  // register t3
        // LOOP: bgt t3, t1, EXIT // i<=num2
        // add t2, t2, t3 // answer=answer+i
        // addi t3, t3, 1 // i++
        // j LOOP         // }
        for (int i=num1; i<=num2; i++) {
            answer = answer + i;
        }
       
    }
}
