/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.briantoone.iterators;

import edu.samford.briantoone.lists.DLinkedList;
import java.util.Iterator;

/**
 *
 * @author kartoone
 */
public class NoisyFilter {
    static DLinkedList<Integer> temps = new DLinkedList<>();
    
    public static void main(String[] args) {
        generateNoisyData(90, 110, 0.2);
        double avg1 = calculateAverage();
        System.out.println("average with noisy data: " + avg1);
        filterNoisyData(90, 110);
        double avg2 = calculateAverage();
        System.out.println("average without noisy data: " + avg2);
    }

    /**
     * Generate data between low and high with 1-noiseprob probability. Otherwise generate something anomalous
     * @param low
     * @param high 
     * @param noiseprob
     */
    private static void generateNoisyData(int low, int high, double noiseprob) {
        java.util.Random r = new java.util.Random();
        for (int i = 0; i < 100000; i++) {
            if(Math.random()<noiseprob) {
                // generate a noisy reading
                temps.insertLast(r.nextInt(200));
            } else {
                // generate typical Alabama summer reading
                temps.insertLast(low+r.nextInt(high-low));
            }
        }
    }

    private static double calculateAverage() {
        double total = 0;
        for (Integer temp : temps) {
            total += temp;
        }
        double average = total / temps.size();
        return average;
    }

    /**
     * Remove any data outside the expected range
     */
    private static void filterNoisyData(int low, int high) {
        Iterator<Integer> it = temps.iterator();
        while(it.hasNext()) {
            int temp = it.next();
            if (temp < low || temp > high) {
                it.remove();
            }
        }
    }
}
