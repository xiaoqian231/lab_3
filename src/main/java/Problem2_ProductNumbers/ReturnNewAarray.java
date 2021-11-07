package Problem2_ProductNumbers;

import java.util.ArrayList;

public class ReturnNewAarray {
    /*
     problem 2.
Given an array of integers, return a new array such that each element at index i of the new array
is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division?
     */
    public ArrayList<Integer> ReturnNew(ArrayList<Integer> InputNumbers) {
        ArrayList<Integer> lists = new ArrayList<>();
        int productAll=1;
        for (int i = 0; i < InputNumbers.size(); i++) {
            int num=InputNumbers.get(i);
            productAll= productAll*num;
        }
        for (int i = 0; i < InputNumbers.size(); i++) {
            int product=productAll/InputNumbers.get(i);
            lists.add(product);
        }
        return lists;
    }


    public ReturnNewAarray() {
    }
}
