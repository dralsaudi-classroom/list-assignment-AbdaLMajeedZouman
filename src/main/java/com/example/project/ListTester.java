package com.example.project;

public class ListTester {
    public static <T> void circularLeftShift(List <T> list, int n)
	    {
		  int counter = 0; 
		  while(counter < n) {
			  list.findFirst();
			  T e = list.retrieve();
			  list.remove();
			  if(!list.empty()) {
			  while(!list.last())
				  list.findNext();
			  }
			  list.insert(e);
			  counter++;
		  }
	       
	    }
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
  	    {
		   if(!l1.empty()) {
			   
			   
		   while(!l1.last()) {
			   l1.findNext();
		   }
		   while(!l1.first()) {
			   l2.insert(l1.retrieve());
			   l1.findPrevious();
		   
			   
		   }
		   l2.insert(l1.retrieve());
		   l2.findFirst();
		   
		   
		   
	     
	    }}}
