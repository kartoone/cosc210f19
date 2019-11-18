/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.briantoone.trees;

/**
 *
 * @author kartoone
 */
public class GenericTreeDemo {
    public static void main(String[] args) {
        GenericTree<String> airports = new GenericTree<>("BHM");
        airports.addChild(airports.root(),"ATL");
        airports.addChild(airports.root(),"MSP");
        System.out.println(airports);
    }
}
