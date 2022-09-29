package com.Pernilla.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* TODO
        * -Create new ArrayList
        * -Add
        * -Get
        * -Remove
        * -Set
        * */

        List<Integer> scoreList = new ArrayList<>();

        System.out.println("Current scoreList: " + scoreList);
        scoreList.add(25);
        scoreList.add(50);
        scoreList.add(150);
        System.out.println("Current scoreList: " + scoreList);

        scoreList.remove(0);
        System.out.println("Current scoreList: " + scoreList);

        System.out.println(scoreList.get(0)); //Prints index

        for (int i=0; i<scoreList.size(); i++) {
            System.out.println("index is: " + scoreList.get(i));
        }

        scoreList.set(0, 25); //param #1= index, param #2 0 value
        System.out.println("Current scoreList: " + scoreList);

        System.out.println(Collections.min(scoreList));

    }
}
