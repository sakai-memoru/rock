package org.rock.sample.beanutils;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class SampleTest {
	
	/* target class */
	Sample instance ;
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void setUp() throws Exception {
		instance = new Sample();
	}

	@Test
	public void test() {
		String name = testName.getMethodName();
		System.out.println("------------------------------------------------------------------------");
		System.out.println(">> " + name + "------------------------------------------------------------------------");
		
		// act
		instance.process();
		
		fail("Not yet implemented");
	}

}
