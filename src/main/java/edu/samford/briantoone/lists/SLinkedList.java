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
public class SLinkedList {
    
    // Attributes
    protected int size; // how many items are in the list
    protected SNode head;
    protected SNode tail;
    
    public SLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }
    
    public void addFirst(SNode newnode) {
        // First, before we forget, increment the size
        size++;
        
        // Now, order matters, tell the new node that its next should be head
        newnode.setNext(head);
        
        // Update the head to reference the newly "added" node
        head = newnode;
        
        // Lastly, do something with the tail
        if (size==1) {
            tail = newnode;
        }
    }
    
    public SNode addFirst(String newdata) {
        // Create the new SNode to store our data
        SNode newnode = new SNode(newdata, null);
        addFirst(newnode);
        return newnode;
    }
    
    public void addLast(SNode newnode) {
        // First, before we forget, increment the size
        size++;
        
        // Now, order matters, tell the new node that its next should be head
        tail.setNext(newnode);
        
        // Update the tail to reference the newly "added" node
        tail = newnode;
        
        // Lastly, do something with the head
        if (size==1) {
            head = newnode;
        }
    }
    
    public SNode addLast(String newdata) {
        // Create the new SNode to store our data
        SNode newnode = new SNode(newdata, null);
        addLast(newnode);
        return newnode;
    }
 
    /**
     * Adds newnode to our list AFTER the pos node
     * @param pos
     * @param newnode 
     */
    public void addAfter(SNode pos, SNode newnode) {
        size++;
        newnode.setNext(pos.getNext());
        pos.setNext(newnode);
        if (pos==tail) {
            tail = newnode;
        }
    }
    
    public SNode addAfter(SNode pos, String newdata) {
        SNode newnode = new SNode(newdata, null);
        addAfter(pos, newnode);
        return newnode;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    @Override
    public String toString() {
        String out = "";
        SNode cur = head;  // ini
        while (cur!=null) {
            out += cur.element();
            cur = cur.getNext();
            if (cur!=null) {
                out += ',';
            }
        }
        return out;
    }
}
