package com.stackroute;
/*2. Write a program to find the number of counts in the following String. Store the output in
      Map<String,Integer> as key value pair.
        Input : String str = “one one -one___two,,three,one @three*one?two”;
       Output : {"one":5 , "two":2, "three" :2}*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class NumberOfWordCount {

    public static void countNumberOfWords(ArrayList<String> list) {

        Map<String, Integer> hashmap = new HashMap<String, Integer>(); /* hashmap is used to store the frequency of an element */

        for (String string : list) {
            Integer number = hashmap.get(string);
            hashmap.put(string, (number == null) ? 1 : number + 1);
        }


        for (Map.Entry<String, Integer> val : hashmap.entrySet()) /* To display the occurrence of elements in arraylist*/
            {
            System.out.println("String " + val.getKey() + " " + "occurs" + ": " + val.getValue() + " times");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Tejaswini");
        list.add("Shet");
        list.add("one");
        list.add("Tejaswini");
        list.add("Shet");
        countNumberOfWords(list);
    }
}

