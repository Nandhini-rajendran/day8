package com.dxc.day8;

import java.util.TreeSet;
import java.util.*;
public class Myset
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> s=new LinkedHashSet<>();
        s.add("10");
        s.add("20");
        s.add("20");
        s.add("1");
        s.add("3");
        System.out.println(s);
    }
}
