package com.dxc.day8;
import java.util.*;

public class ArrayCurd
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner (System.in);
        String str[]=null;
        while(true)
        {

            System.out.println("press 1 for create new array :");
            System.out.println("press 2 for delete an array :");
            System.out.println("press 3 for edit an array :");
            System.out.println("press 4 for display an array :");
            System.out.println("press 5 for exit an array :");
            int choice=ip.nextInt();
            if(choice==1)
            {
                System.out.println("enter the size :");
                int size=ip.nextInt();
                str=new String[size];
                System.out.println("size of array:"+str.length);
                createArray(str);
            }
            if(choice==2)
            {
                 deleteArray(str);
            }
            if(choice==3)
            {
                 editArray(str);
            }
            if(choice==4)
            {
                displayArray(str);
            }
            if(choice==5)
            {
                break;
            }
        }
    }
    private static void createArray(String[] str)
    {
        Scanner ip=new Scanner(System.in);
        for(int i=0;i<str.length;i++)
        {
            System.out.println("Enter the value"+i);
            str[i]=ip.next();
        }
        System.out.println("all value is added to array");

    }
    private static void deleteArray(String[] str)
    {

    }


    private static void editArray(String str[])
    {

    }

    private static void displayArray(String[] str)
    {
        for(int i=0;i<str.length;i++)
        {
            System.out.println("print the value"+str[i]);

        }

    }

}
