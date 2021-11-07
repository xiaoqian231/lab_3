package Problem_1_returnNumbers;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

class CheckNumbersTest {
    public void CheckNumbers() throws Exception {
        CheckNumbers cn = new CheckNumbers();
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(3);
        lists.add(5);
        lists.add(4);
        lists.add(2);
        lists.add(7);
        lists.add(6);
        lists.add(4);
        int target = 8;
        assertEquals(true,cn.CheckNumbers(lists,target) );

    }

}