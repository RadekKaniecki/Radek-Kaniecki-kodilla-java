package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> list) {
        for(int i=0; i<list.size(); i++) {
            int tempNumber = list.get(i);
            if(tempNumber % 2 != 0) {
                list.remove(i);
            }
        }
        return list;
    }
}
