package Problem29_EncodingStrings;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class EncodingStringTest {
    @Test
    public void RunLengthEncoding(){
        EncodingString es=new EncodingString();
        Assert.assertEquals("r3t1u3e1",  es.RunLengthEncoding("rrruuute"));
        Assert.assertEquals("rrrrtttttuuuuuuu",  es.RunLengthDecoding("r4t5u7"));
    }
}