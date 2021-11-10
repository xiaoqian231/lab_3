package Problem3_FindInt;

import Problem_1_returnNumbers.CheckNumbers;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FindMissIntTest {
    @Test
    public void FindMissIntTest()  {
        FindMissInt fm= new FindMissInt();
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(0);
        lists.add(-1);
       // System.out.println(fm.FindMissInt(lists));
        Assert.assertEquals(3,fm.FindMissInt(lists));


    }


}