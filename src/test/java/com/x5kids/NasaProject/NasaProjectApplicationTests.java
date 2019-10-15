package com.x5kids.NasaProject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NasaProjectApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testThatTestsWork() {
		UselessStubForTesting stubby = new UselessStubForTesting();
		String reply = stubby.returnTestPassed();

		assertEquals("This Test Passed!",reply);
	}

}
