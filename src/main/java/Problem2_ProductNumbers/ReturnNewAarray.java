package Problem2_ProductNumbers;

import java.util.ArrayList;
import java.util.Collections;

public class ReturnNewAarray {
    /*
     problem 2.
Given an array of integers, return a new array such that each element at index i of the new array
is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 0, 4, 5], the expected output would be [120, 60, 40, 30, 24].
If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division?
     */
    public ArrayList<Integer> ReturnNew(ArrayList<Integer> InputNumbers) {
        int productAll = 1;
        ArrayList<Integer> lists = new ArrayList<>();
        if (InputNumbers.contains(0)) {// if input numbers  contains 0 ;
            int positon = Collections.binarySearch(InputNumbers, 0);//find the 0 position;
            for (int i = 0; i < InputNumbers.size(); i++) {
                lists.add(0);
            }
            for (int i = 0; i < InputNumbers.size(); i++) {
                if(InputNumbers.get(i)!=0) {
                    productAll= productAll*InputNumbers.get(i);
                }
                }
            lists.set(positon ,productAll );

            return lists;
        } else {// if input numbers not contains 0 ;
            for (int i = 0; i < InputNumbers.size(); i++) {
                int num = InputNumbers.get(i);
                productAll = productAll * num;
            }
            for (int i = 0; i < InputNumbers.size(); i++) {
                int product = productAll /InputNumbers.get(i);
                lists.add(product);
            }
            return lists;
        }
    }

    public ReturnNewAarray() {
    }
}
