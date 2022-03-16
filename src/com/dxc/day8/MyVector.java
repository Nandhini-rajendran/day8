package com.dxc.day8;

import java.util.Vector;

public class MyVector
{
    public static void main(String[] args)
    {
        Vector<Integer> list1=new Vector<>();
        list1.add(1);
        list1.add(23);
        list1.add(45);
        list1.add(444);
        list1.add(4,456);
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);
    }
}
