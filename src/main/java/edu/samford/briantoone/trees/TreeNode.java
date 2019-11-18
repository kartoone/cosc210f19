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
public interface TreeNode<T> {
    public T element();              // returns reference to the data we are storing
    public TreeNode<T> parent();     // returns reference to the parent NODE   
    public TreeNode<T>[] children(); // returns an array of child NODE references
}
