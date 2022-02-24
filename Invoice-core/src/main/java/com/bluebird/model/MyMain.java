package com.bluebird.model;

import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine();

        String text = "hello there";
        char[] arr = text.toCharArray();

        //your code goes here
        for (int i=arr.length-1; i >= 0; i--){
            System.out.print(arr[i]);
        }


        //Reversing using StringBuilder API
        StringBuilder stringBuilder = new StringBuilder("hello there");
        stringBuilder.toString();
        System.out.println(stringBuilder.reverse());


    }

}
