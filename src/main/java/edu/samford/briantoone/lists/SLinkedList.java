/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.briantoone.lists;

/**
 * @param <T> type param for this class
 * @author kartoone
 */
public class SLinkedList<T> {
    
    // Attributes
    protected int size; // how many items are in the list
    protected SNode<T> head;
    protected SNode<T> tail;
    
    public SLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }
    
    public void addFirst(SNode<T> newnode) {
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
    
    public SNode<T> addFirst(T newdata) {
        // Create the new SNode to store our data
        SNode<T> newnode = new SNode<>(newdata, null);
        addFirst(newnode);
        return newnode;
    }
    
    public void addLast(SNode<T> newnode) {
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
    
    public SNode<T> addLast(T newdata) {
        // Create the new SNode to store our data
        SNode<T> newnode = new SNode<>(newdata, null);
        addLast(newnode);
        return newnode;
    }
 
    /**
     * Adds newnode to our list AFTER the pos node
     * @param pos
     * @param newnode 
     */
    public void addAfter(SNode<T> pos, SNode<T> newnode) {
        size++;
        newnode.setNext(pos.getNext());
        pos.setNext(newnode);
        if (pos==tail) {
            tail = newnode;
        }
    }
    
    public SNode<T> addAfter(SNode<T> pos, T newdata) {
        SNode<T> newnode = new SNode<>(newdata, null);
        addAfter(pos, newnode);
        return newnode;
    }
    
    /**
     * Searches the entire linked list until searchdata is found.
     * 
     * @param searchdata
     * @return the SNode containing the searchdata or null if not found
     */
    public SNode<T> find(T searchdata) {
        SNode<T> cur = head;
        while(cur!=null) {
            if (cur.element().equals(searchdata)) {
                return cur;
            }
            cur = cur.getNext();
        }
        return null;
    }
    
    /**
     * Finds and removes the FIRST occurrence of the given data
     * @param searchdata
     * @return the removed node if found otherwise null
     */
    public SNode<T> remove(T searchdata) {
        SNode<T> doomed = find(searchdata);
        if (doomed!=null) {
            remove(doomed);
        }
        return doomed;
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
        SNode<T> cur = head;  // ini
        while (cur!=null) {
            out += cur.element();
            cur = cur.getNext();
            if (cur!=null) {
                out += ',';
            }
        }
        return out;
    }

    private void remove(SNode<T> doomed) {
        // difficult to implement 
    }
}
