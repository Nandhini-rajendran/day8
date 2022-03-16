package com.dxc.day8;
import java.util.*;
public class CollectionClass
{
    public static void main(String[] args)
    {
        ArrayList arr=new ArrayList();
        ArrayList arr2=new ArrayList();
        arr.add(1);
        arr.add(1000);
        arr.add("shiva");
        arr.add(1.7f);
        arr.add(100000000000000l);
        arr.add(false);
        arr2.add(2);
        arr2.add(2000);
        arr2.add("nandhini");
        arr2.add(2.3f);
        arr2.add(20000000000000l);
        arr2.add(true);
        System.out.println(arr);
        System.out.println(arr2);
        arr.remove("shiva");
        arr2.remove(true);
      //  arr.forEach((e)->{e=e+"a";
        //             System.out.println(e+" ");
        //});
        //System.out.println(arr);
        //System.out.println(arr2);
        arr.addAll(arr2);
        System.out.println(arr);
        //System.out.println(arr2.contains("aeeee"));
        //System.out.println(arr2.size());
        //arr.clear();
        //System.out.println(arr);
        //System.out.println(arr.isEmpty());

    }
}
