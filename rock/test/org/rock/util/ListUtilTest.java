package org.rock.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class ListUtilTest {

	@Rule
	public TestName name = new TestName();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDump() {
		
		System.out.println("//---------------------------------------------------");
		System.out.println(">> " + name.getMethodName() + " ---------");
		
		// arrange
		List<String> lst = new ArrayList<>() ;
		{
			//  value
			//  set
			lst.add("sakai");
			lst.add("memoru");
			lst.add("abe");
			lst.add("shinosuke");
		}
		
		// act
		String actual = BeanUtil.dump(lst);
		String actual2 = ListUtil.dump(lst);
		System.out.println(actual);
		System.out.println(actual2);
		
		// assert
		//fail("Not yet implemented");
	}

}
