package com.sha1.test;

import org.junit.Assert;
import org.junit.Test;

public class testSha1 {
	private static final String key1 = "b363f46a";
	/**
	 * Expected result get from https://www.functions-online.com/sha1.html
	 * 
	 */
	String result = "0630da3368f2c9fc5d0f646e2dead874f4613f56";
	@Test
	public void testSha(){		
		System.out.println("Encrypted key for "+key1+":");
		String output = sha1.sha1_encryption(key1);
		System.out.println(output);
		Assert.assertEquals(result, output);
		
	}
	
	
}

