package org.example.listinterface;

import java.util.*;

public class Reverse_a_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //Reversing list using arraylist
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println("Given List : "+list);
        for(int i = list.size()-1;i>=0;i--){
            //System.out.println(list.get(i));
            result.add(list.get(i));
        }
        System.out.println("Reversed list using ArrayList : "+result);
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        ListIterator<Integer> iterator = list1.listIterator(list1.size());
       LinkedList<Integer> result2 = new LinkedList<>();

        //Reversing using linkedlist
        /*while(iterator.hasPrevious()){
            //System.out.println(iterator.previous());
            result2.add(iterator.previous());
        }*/
        for(int i = list1.size()-1; i>=0; i--){
            result2.add(list1.get(i));
        }
        System.out.println("Reversed list using Linkedlist :"+result2);

    }
}
