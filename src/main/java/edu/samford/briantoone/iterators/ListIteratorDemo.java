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
public class ListIteratorDemo {
    public static void main(String[] args) {
        DLinkedList<Integer> highs = new DLinkedList<>();
        highs.insertLast(100);
        highs.insertLast(99);
        highs.insertLast(102);
        highs.insertLast(95);
        highs.insertLast(97);
        Iterator<Integer> it = highs.iterator();
        int total = 0;
        while(it.hasNext()) {
            Integer temp = it.next();
            total += temp;
            System.out.println(temp);
        }
        double average = total / highs.size();
        System.out.println("Avg: " + average);
    }
}