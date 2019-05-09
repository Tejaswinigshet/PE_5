/*Write a program to implement set interface which sorts the given randomly ordered names in

        ascending order. Convert the sorted set in to an array list
        Input : Harry Olive Alice Bluto Eugene
        Output :
        Sorted Set : Alice Bluto Eugene Harry Olive
        Array list from Set : Alice Bluto Eugene Harry Olive*/
package com.stackroute;
import java.util.*;

public class SortRandomlyOrderedNames {
    public static void main(String[] args)
    {

        ArrayList<String> listArray = new ArrayList<String>();// To create a list of strings
        listArray.add("Harry");
        listArray.add("Olive");
        listArray.add("Alice");
        listArray.add("Bluto");
        listArray.add("Eugene");
        Collections.sort(listArray);/* Collections.sort method is to sort the
       elements of ArrayList in ascending order. */
        System.out.println("Sorted Set :" + listArray);//To print the sorted list
        listArray.remove("Harry");
        listArray.remove("Olive");
        listArray.remove("Alice");
        listArray.remove("Bluto");
        listArray.remove("Eugene");
        System.out.println("Sorted Set :" + listArray);
    }

}