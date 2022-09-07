package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
         ArrayList arrayList= new ArrayList<>();
        LinkedList<Integer> linkedList= new LinkedList<>();

        for (int i = 0; i <arr.length; i++) {
            arr[i] = random.nextInt(2);
            arrayList.add(i,random.nextInt(2));
            linkedList.add(i,random.nextInt(2));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arrayList);
        System.out.println(linkedList);

        System.out.println();
        sort(arr);
        sort(arrayList);
        sort(linkedList);

    }
    public static void sort (int [] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sort (ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
    public static void sort (LinkedList<Integer>linkedList){
Collections.sort(linkedList);
        System.out.println(linkedList);
    }
}