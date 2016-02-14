package org.rock.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.rock.util.samplebean.Human;

public class DumpUtilTest {

	@Rule 
	public TestName testName = new TestName();
	
	@Before
	public void setUp() throws Exception {
	}

	@Ignore
	public void testStringDump() {
		// arrange
		String expected = "sakai.mitsuru";
		String actual = "";
		// act
		actual = DumpUtil.dump(expected);
		
		// assert
		System.out.println(actual);
		assertEquals(expected,actual);
	}
	@Test
	public void testStringToJson() {
		// arrange
		String expected = "sakai.mitsuru";
		String actual = "";
		// act
		actual = DumpUtil.toJson(expected);
		
		// assert
		System.out.println(actual);
		assertEquals("\"" + expected + "\"",actual);
	}

	@Test
	public void testStringArrayToJson() {
		// arrange
		String[] strs = new String[]{"sakai.mitsuru"
										,"sakai.tamotsu"
										,"sakai.kuniyuki"
										};
		String actual = "";
		// act
		actual = DumpUtil.toJson(strs);
		
		// assert
		System.out.println(actual);
		String[] strs2 = new String[strs.length];
		int i = 0;
		for(String str :strs){
			strs2[i] = "\"" + str + "\"" ;
			i = i + 1;
		}
		String temp = Arrays.toString(strs2);
		
		assertEquals(StringUtils.deleteWhitespace(temp),actual);
	}
	@Test
	public void testStringArrayListToJson() {
		// arrange
		String[] strs = new String[]{"sakai.mitsuru2"
										,"sakai.tamotsu2"
										,"sakai.kuniyuki2"
										};
		String actual = "";
		List<String> lst = new ArrayList<>();
		lst = Arrays.asList(strs);
		
		// act
		actual = DumpUtil.toJson(lst);
		
		// assert
		System.out.println(actual);
		String[] strs2 = new String[strs.length];
		int i = 0;
		for(String str :strs){
			strs2[i] = "\"" + str + "\"" ;
			i = i + 1;
		}
		String temp = Arrays.toString(strs2);
		
		assertEquals(StringUtils.deleteWhitespace(temp),actual);
	}
	
	@Test
	public void testBeanToJson() {
		// arrange
		Human bean = new Human();
		bean.setFirstName("sakai");
		bean.setSecondName("mitsuru");
		bean.setBloodType("A");
		bean.setAge(50);
		bean.setId(BigDecimal.valueOf(123456L));
		
		// act
		String actual = "";
		actual = DumpUtil.toJson(bean);
		
		// assert
		System.out.println(actual);
	}
	
	@Test
	public void testBeanArrayToJson() {
		// arrange
		List<Human> beanlst = new ArrayList<>();
		Human bean1 = new Human();
		bean1.setFirstName("sakai");
		bean1.setSecondName("mitsuru");
		bean1.setBloodType("A");
		bean1.setAge(50);
		bean1.setId(BigDecimal.valueOf(123456L));
		Human bean2 = new Human();
		bean2.setFirstName("sakai");
		bean2.setSecondName("tamotsu");
		bean2.setBloodType("A");
		bean2.setAge(51);
		bean2.setId(BigDecimal.valueOf(123678L));
		
		beanlst.add(bean1);
		beanlst.add(bean2);		
		// act
		String actual = "";
		actual = DumpUtil.toJson(beanlst);
		
		// assert
		System.out.println(actual);
	}
	

}
