package org.rock.sample.beanutils;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Map;

import org.rock.util.BeanUtil;
import org.rock.util.MapUtil;
import org.rock.util.samplebean.Employee;
import org.rock.util.samplebean.Human;

import org.apache.commons.beanutils.BeanUtils;


public class Sample {

	Human humanBean1;
	Human humanBean2;
	Human humanBean3;

	public Sample() {
		super();
		humanBean1 = new Human();
		humanBean2 = new Human();
	}
	
	public void process(){
		
		try {
			Employee empBean = new Employee();
			
			// values
			BigDecimal employeeId = BigDecimal.valueOf(12345L); 
			String firstName = "Sakai";
			String secondName = "Memoru";
			String lastName = "Misa";
			// arrange
			empBean.setEmployeeId(employeeId);
			empBean.setFirstName(firstName);
			empBean.setSecondName(secondName);
			empBean.setLastName(lastName);
			
			// field map
			String[] srcKeys = new String[] {
					 "employeeId"
					,"firstName"
					,"lastName"
					};
			String[] destKeys = new String[] {
					 "id"
					,"firstName"
					,"secondName"
					};
			Map<String,String> fieldMap = (Map<String,String>)MapUtil.toMapByHorizonArray(srcKeys, destKeys);
			System.out.println(fieldMap.toString());
					
			/////////////////////////////////////////
			// BeanUtils.copyProperties
			BeanUtils.copyProperties(empBean, humanBean1);
			System.out.println(BeanUtil.dump(humanBean1));
			
			/////////////////////////////////////////
			// BeanUtils.setProperty 
			// FIXME ï∂éöóÒÇÅAsetÇµÇΩèÍçáÇÃìÆçÏ
			BeanUtils.setProperty(humanBean2, "firstName", firstName);
			BeanUtils.setProperty(humanBean2, "secondName", lastName);
			BeanUtils.setProperty(humanBean2, "age", "29");
			BeanUtils.setProperty(humanBean2, "sex", "1");
			BeanUtils.setProperty(humanBean2, "bloodType", "B");
			BeanUtils.setProperty(humanBean2, "createDate", "2016/02/03");
			System.out.println(BeanUtil.dump(humanBean2));
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
