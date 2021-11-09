package Problem2_ProductNumbers;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ReturnNewAarrayTest extends TestCase {
    @Test
    public void ReturnNewArray()  {
        ReturnNewAarray rt = new ReturnNewAarray();
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(5);
        lists.add(9);
        lists.add(2);
        ArrayList<Integer> newlist = new ArrayList<>();
        newlist.add(90);
        newlist.add(18);
        newlist.add(10);
        newlist.add(45);
        Assert.assertEquals(newlist, rt.ReturnNew(lists));

    }


}