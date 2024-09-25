package com.example.project;

public class DLL<T> {
	private DLLNode<T> head;
	private DLLNode<T> current;

    public DLL() {
        head = current = null;
    }
    public boolean empty() {
        return head == null;
    }
    public boolean last() {
        return current.next == null;
    }
    public boolean first() {
        return current.previous == null;
    }
    public boolean full() {
        return false;
    }
    public void findFirst() {
        current = head;
    }
    public void findNext() {
        current = current.next;
    }
    public void findPrevious() {
        current = current.previous;
    }
    public T retrieve() {
        return current.data;
    }
    public void update(T val) {
        current.data = val;
    }
    public void insert(T val) {
        DLLNode<T> tmp = new DLLNode<T>(val);
        if(empty()) {
            current = head = tmp;
        }
        else {
            tmp.next = current.next;
            tmp.previous = current;
            if(current.next != null)
                current.next.previous = tmp;
            current.next = tmp;
            current = tmp;
        }
    }
    public void remove() {
        if(current == head) {
            head = head.next;
            if(head != null)
               head.previous = null;
        }
        else {
            current.previous.next = current.next;
            if(current.next != null)
               current.next.previous = current.previous;
        }
        if(current.next == null)
            current = head;
        else
            current = current.next;
    }
    public void removeBetween(T e1, T e2) {
    	Node<T> tmp = current;
    	Node<T> E1 = null ;
    	Node<T> E2 = null;
    	current = head;
    	if(current.data.equals(e1))
    		E1 = current;
    	
    	while(current.next != null) {
    		current = current.next;
    		if(current.data.equals(e1))
    			E1 = current;
    		else if(current.data.equals(e2))
    			E2 = current;
    	}
    	
    	
    	if(E1 != null && E2 != null) {
    		E1.next = E2;
    	    E2.previous = E1;
    	    current = head;
    	    }
    	else{
    		current = tmp;
    	
    	}
}}
