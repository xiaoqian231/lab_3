package Problem27_CheckBrackets;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CheckBracketsTest  {
    @Test
    public void CheckBracketsTest(){

        CheckBrackets cb=new CheckBrackets();
        Assert.assertEquals(true,cb.CheckBrackets("({[]})"));
        Assert.assertEquals(false,cb.CheckBrackets("({[])"));
    }
}