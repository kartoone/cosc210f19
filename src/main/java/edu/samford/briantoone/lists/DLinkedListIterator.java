/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.briantoone.lists;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author kartoone
 */
public class DLinkedListIterator<T> implements Iterator<T> {
    protected DLinkedList<T> theList;
    protected DNode<T> cur;
    public DLinkedListIterator(DLinkedList<T> theList) {
        this.theList = theList;
        cur = theList.first();
    }

    /**
     * Check to see if there are any nodes left to visit.
     * 
     * @return 
     */
    @Override
    public boolean hasNext() {
        return cur!=null;
    }

    @Override
    public T next() {
        T theData = cur.element();
        cur = theList.next(cur);
        return theData;
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {
        Iterator.super.forEachRemaining(action); //To change body of generated methods, choose Tools | Templates.
    }
}
