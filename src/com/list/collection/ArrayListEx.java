package com.list.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
    public class ArrayListEx{
        public static void main(String[] args) {
            //ArrayList implements List
            //internal DS is Dynamic Array
            //maintain the insertion order
            //Stores both heterogeneous and homogeneous data
            //Duplicates are allowed
            ArrayList arr=new ArrayList();
            arr.ensureCapacity(42);//this will allocate the initial capacity with given value
            //adding the objects
            arr.add(24);
            arr.add(12);
            arr.add(35);
            arr.add(2);
            arr.add(7);
            arr.add(1,5);//inserting data at particular index
            arr.contains(5);//if it contains returns true
            arr.get(3);//return the value at the particular index
            arr.isEmpty();//returns true or false
            arr.size();//returns the size of the array
            arr.trimToSize();//it will trim the remaining indexes are empty
            arr.get(3);//getting value from index
            arr.remove(5);//removing the value based on index

            ArrayList arr1=new ArrayList<>();
            arr1.add(5);
            arr1.add(7);
            arr1.add(41);
            arr.addAll(arr1);//we can merge one collection to another collection
            System.out.println("====Iterator===");
            //iterator is a method which present in all the type off collection classes
            //By using iterator we can retrieve data
            Iterator itr=arr.iterator();//retrieve the data in the forward position
            while(itr.hasNext()){//hasNext to check the data  present in the  collection or not
                System.out.println(itr.next());
            }
            System.out.println("===ListIterator===");
            //list iterator present in only list based classes
            //we can retrieve data from backward position as well as forward
            ListIterator litr=arr.listIterator(arr.size());
            while(litr.hasPrevious()){
                System.out.println(litr.previous());

            }
            System.out.println("===Fail Fast===");
            Iterator itr1=arr.iterator();
            while(itr1.hasNext()){
                System.out.println(itr1.next());
                //Structural modification: while accessing the data on that time we are doing any modification
                //Iterator will throw exception "ConcurrentModificationException" here we can archive FailFast
                arr.add(1);
            }
        }
    }

