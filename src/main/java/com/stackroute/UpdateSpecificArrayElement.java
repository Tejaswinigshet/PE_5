/* Write a Java program to update specific array element by given element and empty the array list.
        Input: [Apple, Grape, Melon, Berry]
        Output: [Kiwi, Grape, Mango, Berry]*/

package com.stackroute;
import java.util.ArrayList;
import java.util.Arrays;

public class UpdateSpecificArrayElement {
    public static void main(String[] args)
    {
        //ArrayList is used to create empty arrayList
        ArrayList<String> listArrayNames = new ArrayList<String>(Arrays.asList( "Apple", "Grape", "Melon" , "Berry") );
        System.out.println(listArrayNames);  //list size is 4
        listArrayNames.set(0, "Kiwi");//Add element at 0th index
        listArrayNames.set(2, "Mango");//Add element at 2nd index
        System.out.println(listArrayNames);  //list size is 4
    }
}