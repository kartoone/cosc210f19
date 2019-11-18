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
public class GenericTreeNode<T> implements TreeNode<T> {

    protected T data;                   // this node's data
    protected TreeNode<T> parent;       // this node's parent
    protected TreeNode<T> children[];   // this node's children
    
    public GenericTreeNode(T thedata) {
        this.data = thedata;
        this.parent = null;
        this.children = null;
    }
    
    public GenericTreeNode(T thedata, TreeNode<T> theparent, TreeNode<T> thechildren[]) {
        this.data = thedata;
        this.parent = theparent;
        this.children = thechildren;
    }
    
    @Override
    public T element() {
        return data;
    }

    @Override
    public TreeNode<T> parent() {
        return parent;
    }

    @Override
    public TreeNode<T>[] children() {
        return children;
    }
    
}
