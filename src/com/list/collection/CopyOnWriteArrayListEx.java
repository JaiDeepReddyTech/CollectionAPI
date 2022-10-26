package com.list.collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    public static void main(String[] args) {
        //To archive FailSafe in iterator by using CopyOnWriteArrayList
        //This class present in java.util.concurrent
        //FailSafe is a mechanism which will stop concurrent modification exception
        CopyOnWriteArrayList c=new CopyOnWriteArrayList<>();
        c.add(5);
        c.add(7);
        c.add(12);
        c.add(24);
        System.out.println("===Fail Safe===");
        Iterator itr1=c.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
            //Structural modification: while accessing the data on that time we are doing any modification
            //Iterator will stop throwing exception "ConcurrentModificationException" here we can archive FailSafe
            c.add(17);
        }
    }
}