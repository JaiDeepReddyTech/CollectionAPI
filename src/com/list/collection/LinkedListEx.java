package com.list.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListEx {
    public static void main(String[] args) {
        //LinkedList implements Link,DeQueue
        //Internal DS is Doubly LinkedList
        //It's works in the form of Nodes
        //LinkedList have extra two methods addFirst(),addLast();
        //Duplicates are allowed
        LinkedList list=new LinkedList();
        list.add(7);
        list.add(1);
        list.add(3);
        list.add(47);
        list.add(21);
        list.add(1,5);//inserting data at particular index
        list.contains(5);//if it contains returns true
        list.get(3);//return the value at the particular index
        list.isEmpty();//returns true or false
        list.size();//returns the size of the array
        list.get(3);//getting value from index
        list.addFirst(23);//inserting data at the  first index of the node
        list.addLast(3);//inserting data at the  last index of the node
        System.out.println("====Iterator===");
        //iterator is a method which present in all the type off collection classes
        //By using iterator we can retrieve data
        Iterator itr=list.iterator();//retrieve the data in the forward position
        while(itr.hasNext()){//hasNext to check the data  present in the  collection or not
            System.out.println(itr.next());
        }
        System.out.println("===ListIterator===");
        //list iterator present in only list based classes
        //we can retrieve data from backward position as well as forward
        ListIterator litr=list.listIterator(list.size());
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        System.out.println("===Fail Fast===");
        Iterator itr1=list.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
            //Structural modification: while accessing the data on that time we are doing any modification
            //Iterator will throw exception "ConcurrentModificationException" here we can archive FailFast
            list.add(1);
        }
    }
}
