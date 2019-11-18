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
public class GenericTree<T> implements Tree<T> {

    protected TreeNode<T> root; // this tree's root node
    protected int size;         // how many nodes are in the tree
    protected int height;       // keep track of the greatest depth leaf here so that we don't have to calculate later!
    
    public GenericTree() {
        this.root = null;
        this.size = 0;
        this.height = 0;
    }
    
    public GenericTree(T rootdata) {
        this.root = new GenericTreeNode(rootdata);
        this.size = 1;
        this.height = 0;
    }
    
    @Override
    public TreeNode<T> root() {
        return root;
    }

    @Override
    public TreeNode<T> parent(TreeNode<T> node) {
        return node.parent();
    }

    @Override
    public TreeNode<T>[] children(TreeNode<T> node) {
        return node.children();
    }

    // will not work if the tree has a lot of nodes
    @Override
    public int depth(TreeNode<T> node) {
        if (node==root)
            return 0;
        else
            return 1+depth(node.parent());            
    }
    
    // example - iterative version of depth
    public int depthIterative(TreeNode<T> node) {
        int count = 0;
        while (node!=root) {
            count++;
            node=node.parent();
        }
        return count;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int height() {
        return height;
    }

    public TreeNode<T> addChild(TreeNode<T> parent, T childdata) {
        TreeNode<T> child = new GenericTreeNode<>(childdata, parent, null);
        size++;
        if (height == depth(parent)) {
            height++;
        }
        return child;
    }
    
    @Override
    public boolean ancestor(TreeNode<T> node, TreeNode<T> ancestornode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean descendant(TreeNode<T> node, TreeNode<T> descendantnode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        String treestr = "Generic Tree: " + size + "," + height;
        return treestr;
    }
}
