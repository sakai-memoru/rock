package org.rock.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.rock.util.samplebean.Human;

public class BeanUtilTest {

	@Rule
	public TestName name = new TestName();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDump() {
		
		System.out.println("//---------------------------------------------------");
		System.out.println(">> " + name.getMethodName() + " ---------");
		
		try {
			// arrange
			Human bean = new Human();
			{
				//  value
				BigDecimal id = BigDecimal.valueOf(1234L) ; // Identifier
				String firstName = "Abe" ; // first name
				String secondName = "Shinosuke" ; // second name
				Integer sex = 0; // sex
				Integer age = 35 ; // age
				String bloodType = "A" ; // blood type
				Date createDate = DateUtils.parseDate("2016/02/02", "yyyy/MM/dd"); // create date
				Date updateDate = null; // update date
				//  set
				bean.setId(id);
				bean.setFirstName(firstName);
				bean.setSecondName(secondName);
				bean.setSex(sex);
				bean.setAge(age);
				bean.setBloodType(bloodType);
				bean.setCreateDate(createDate);
				bean.setUpdateDate(updateDate);
			}
			
			// act
			String actual = BeanUtil.dump(bean);
			System.out.println(actual);
			
			// assert
			//fail("Not yet implemented");
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		
	}

}
