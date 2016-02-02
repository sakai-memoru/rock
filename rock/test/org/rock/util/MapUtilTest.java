package org.rock.util;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.time.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class MapUtilTest {

	@Rule
	public TestName name = new TestName();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testToMapByVerticalArray() {
		
		System.out.println("//---------------------------------------------------");
		System.out.println(">> " + name.getMethodName() + " ---------");
		
		// arrange
		Object[][] aryary = new Object[][] {
			 	 { "id"          , "employeeId" }
				,{ "firstName"   , "firstName" }
				,{ "secondName"  , "secondName" }
				,{ "sex"         , "sex" }
				,{ "age"         , "age" }
				,{ "bloodType"   , "bloodType" }
				,{ "createdDate" , "createdDate" }
				,{ "updatedDate" , "updatedDate" }
				};
		
		// act
		Map<String,String> map = MapUtil.toMapByVerticalArray(aryary);
		System.out.println(map.toString());
		
		// assert
		//fail("Not yet implemented");
	}

	@Test
	public void testToMapByHorizonArray() {
		
		System.out.println("//---------------------------------------------------");
		System.out.println(">> " + name.getMethodName() + " ---------");
		
		try {
			// arrange
			String[] aryKeys = new String[] {
				 	 "id"
					,"firstName"
					,"secondName"
					,"sex"
					,"age"
					,"bloodType"
					,"createdDate"
					,"updatedDate"
					};
			Object[] aryValues = new Object[] {
				 	 Long.valueOf(1234L)
					,"abe"
					,"shinosuke"
					,"0"
					,"33"
					,"A"
					,DateUtils.parseDate("2016/02/02", "yyyy/MM/dd")
					,ObjectUtils.NULL
					};
			
			// act
			Map<String,Object> map = MapUtil.toMapByHorizonArray(aryKeys, aryValues);
			System.out.println(map.toString());
			
			// assert
			//fail("Not yet implemented");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw (e);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
