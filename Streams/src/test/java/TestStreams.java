import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import streams.Average;
import streams.PalindromeCheck;
import streams.StartsA;

public class TestStreams {

	@Test
	public void test() {
		assertEquals(22,Average.avg(Arrays.asList(10,20,30,45,5)));
	}
	@SuppressWarnings("rawtypes")
	@Test
	public void test1()
	{
		assertEquals(Arrays.asList("lol","pip","pop"),PalindromeCheck.Palindrome(new ArrayList(Arrays.asList("lol","pip","pop","push"))));
	}
	@Test
	public void test2()
	{
		assertEquals(Arrays.asList("abc"),StartsA.check(Arrays.asList("abc","bob")));
	}
}
