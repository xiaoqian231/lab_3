package Problem3_FindInt;

import java.util.ArrayList;
import java.util.Collections;

public class FindMissInt {
    /*
    Problem 4
Given an array of integers, find the first missing positive integer in linear time and constant space.
In other words, find the lowest positive integer that does not exist in the array.
The array can contain duplicates and negative numbers as well.
For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
You can modify the input array in-place.
     */
    public int FindMissInt(ArrayList<Integer> InputNumbers) {
        ArrayList<Integer> FindMissInt = new ArrayList<>();
        Integer max = Collections.max(InputNumbers);
        if (max > 0) {
            FindMissInt.add(max + 1);
            for (int i = 0; i < max; i++) {
                if (!InputNumbers.contains(max - i)) {
                    FindMissInt.add(max - i);
                }
            } return Collections.min(FindMissInt);
        }else{
            return 1;
        }
    }


}
