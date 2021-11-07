package Problem_1_returnNumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CheckNumbers {
/*
 problem 1
 Given a list of numbers, return whether any two sums to k.
 For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */

    public CheckNumbers() {
    }

    public Boolean CheckNumbers(ArrayList<Integer> InputNumbers, int K) {

    Set<Integer> set = new HashSet<>();
        for (int i = 0; i < InputNumbers.size(); i++) {
            int temp=InputNumbers.get(i);
            if(InputNumbers.contains(K - temp)){
                set.add(temp);
            }
        }
return !set.isEmpty();
}

//test
}
