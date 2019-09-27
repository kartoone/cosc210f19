/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.briantoone.lists;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author kartoone
 */
public class PerformanceComparison {
    public static final int MAX = 1_000_000;
    
    public static void main(String[] args) throws FileNotFoundException {
        // 0. set aside a couple longs for instrumentation
        long start = 0;
        long finish = 0;
        long arraytime = 0;
        long listtime = 0;
        
        // 1. generate a lot of data
        generateData();

        // 2. prepare output for excel
        System.out.println("operation,array,linkedlist");
        
        // 3. start measuring ... construction first
        start = System.currentTimeMillis();
        double nums[] = new double[MAX];
        finish = System.currentTimeMillis();
        arraytime = finish - start;
        start = System.currentTimeMillis();
        DLinkedList<Double> numlist = new DLinkedList<>();
        finish = System.currentTimeMillis();
        listtime = finish - start;
        System.out.println("construction,"+arraytime+","+listtime);
        
        // populating entire data structure
        File f = new File("randomnums.txt");
        Scanner filein = new Scanner(f);
        int i = 0;
        arraytime = 0;
        listtime = 0;
        while(filein.hasNextDouble()) {
            double d = filein.nextDouble();
            
            start = System.nanoTime();
            numlist.insertLast(d);
            finish = System.nanoTime();
            listtime += (finish-start);
            
            start = System.nanoTime();
            nums[i++] = d;
            finish = System.nanoTime();
            arraytime += (finish-start);
        }
        System.out.println("populating,"+arraytime/1_000_000+","+listtime/1_000_000);
        
        // inserting an item at the beginning of each data structure
        double newItem = Math.random();
        start = System.nanoTime();
        numlist.insertFirst(newItem);
        finish = System.nanoTime();
        listtime = finish-start;
        
        start = System.nanoTime();
        double tmp[] = new double[nums.length+1];
        for (int j = 1; j < tmp.length; j++) {
            tmp[j] = nums[j-1];
        }
        nums = tmp;
        nums[0] = newItem;
        finish = System.nanoTime();
        arraytime = finish-start;
        System.out.println("insert beginning,"+arraytime/1_000_000+","+listtime/1_000_000);

        // inserting an item in the middle of each data structure
        newItem = Math.random();
        start = System.nanoTime();
        tmp = new double[nums.length+1];
        for (int k = 0; k<tmp.length/2; k++) {
            tmp[k] = nums[k];
        }
        for (int j = 1+tmp.length/2; j < tmp.length; j++) {
            tmp[j] = nums[j-1];
        }
        nums = tmp;
        nums[tmp.length/2] = newItem;
        finish = System.nanoTime();
        arraytime = finish-start;
        
        start = System.nanoTime();
        int theMiddle = numlist.size()/2;
        DNode cur = numlist.first();
        i = 0;
        while(i<theMiddle) {
            cur = cur.getNext();
            i++;
        }
        numlist.insertAfter(cur, newItem);
        finish = System.nanoTime();
        listtime = finish-start;
        System.out.println("insert middle,"+arraytime/1_000_000+","+listtime/1_000_000);
        
        // replacing an item in the array
        nums[nums.length/2] = Math.random();
        
        
    }

    private static void generateData() throws FileNotFoundException {
        File f = new File("randomnums.txt");
        PrintWriter out = new PrintWriter(f);
        for(int i=0; i<MAX; i++)
            out.println(Math.random());
        out.close();
    }
}
