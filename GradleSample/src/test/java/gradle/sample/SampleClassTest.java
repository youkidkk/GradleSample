package gradle.sample;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("javadoc")
public class SampleClassTest {

    @Test
    public void testSampleMethod() {
        int intValue = 1;
        Assert.assertEquals(intValue * 2, new SampleClass().sampleMethod(intValue));
    }

    @Test
    public void testMain() {
        SampleClass.main(new String[] { "1" });
    }

    @Test
    public void testMainNoArgs() {
        SampleClass.main(new String[] {});
    }

    @Test
    public void testMainThrowsNumberFormatException() {
        SampleClass.main(new String[] { "a" });
    }

}
