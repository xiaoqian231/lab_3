package Problem3_FindInt;

import Problem2_ProductNumbers.ReturnNewAarray;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        FindMissInt fm= new FindMissInt();
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(0);
        lists.add(-1);
        System.out.println(fm.FindMissInt(lists));

    }
}
