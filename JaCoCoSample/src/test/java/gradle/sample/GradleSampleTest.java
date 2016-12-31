package gradle.sample;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("javadoc")
public class GradleSampleTest {

	@Test
	public void testJudgeReturnsTrue() {
		boolean result = new GradleSample().judge(2);
		Assert.assertTrue(result);
	}

	@Test
	public void testJudgeReturnsFalse() {
		boolean result = new GradleSample().judge(1);
		Assert.assertFalse(result);
	}

}
