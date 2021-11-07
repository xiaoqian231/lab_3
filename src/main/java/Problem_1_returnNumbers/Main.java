package Problem_1_returnNumbers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CheckNumbers cn = new CheckNumbers();
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(5);
        lists.add(9);
        lists.add(2);
        System.out.println("whether any two sums to k?"+cn.CheckNumbers(lists ,6));
    }
}
