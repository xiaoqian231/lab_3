package Problem2_ProductNumbers;

import Problem_1_returnNumbers.CheckNumbers;

import java.util.ArrayList;

public class main {


    public static void main(String[] args) {
        ReturnNewAarray rt = new ReturnNewAarray();
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(5);
        lists.add(9);
        lists.add(2);

        ArrayList<Integer> newlist = rt.ReturnNew(lists);
        for (Integer i : newlist) {
            System.out.println(i);
        }
    }
}
