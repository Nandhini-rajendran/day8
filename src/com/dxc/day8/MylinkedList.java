package com.dxc.day8;
import java.util.*;
public class MylinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list1=new LinkedList<Integer>();
        list1.add(1);
        list1.add(100);
        list1.add(20);
        list1.add(11);
        list1.add(50);
        list1.add(5,200);
        list1.add(2,67);
        //list1.clear();
        System.out.println(list1.size());
        list1.addFirst(110);
        list1.offer(110);
        list1.offer(67);
        //System.out.println(list1.toArray());
        System.out.println(list1);
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println(list1);

    }
}
