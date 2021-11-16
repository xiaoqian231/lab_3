package Problem40_FindNonDuplicated;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class FindNonDuplicated {

    //Given an array of integers where every integer occurs three times except for one integer,
    // which only occurs once, find and return the non-duplicated integer.
    //For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.

    public int FindNonDuplicated(ArrayList<Integer> input) {
        int result=0;
            int ones = 0;//记录只出现过1次的bits
            int twos = 0;//记录只出现过2次的bits
            int threes;
            for(int i = 0; i < input.size(); i++){
                int t = input.get(i);
                twos |= ones&t;//要在更新ones前面更新twos
                ones ^= t;
                threes = ones&twos;//ones和twos中都为1即出现了3次
                ones &= ~threes;//抹去出现了3次的bits
                twos &= ~threes;
            }
            return ones;
    }

}
