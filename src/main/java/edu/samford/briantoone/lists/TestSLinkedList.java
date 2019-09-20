/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.briantoone.lists;

/**
 *
 * @author kartoone
 */
public class TestSLinkedList {
    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();
        // test an empty list
        System.out.println("size==0:             " + list.size());
        System.out.println("toString=='':        " + list.toString());
        
        // test a one item list
        list.addFirst("BHM");
        System.out.println("size==1:             " + list.size());
        System.out.println("toString=='BHM':     " + list.toString());
        
        // test a two item list
        list.addLast("ATL");
        System.out.println("size==2:             " + list.size());
        System.out.println("toString=='BHM,ATL': " + list);
    }
}