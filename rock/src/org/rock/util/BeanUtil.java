package org.rock.util;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.rock.util.samplebean.User;


public class BeanUtil {

	public void print() throws IllegalAccessException, InvocationTargetException{
		
		try {
			User bean = new User();
			
			// [✓] JavaBeanへのset
			// BeanUtils.setProperty 
			BeanUtils.setProperty(bean, "userId", "1234");
			
			System.out.println(bean.toString());
			
			// [✓] JavaBeanからのget
			// BeanUtils.getProperty
			System.out.println(BeanUtils.getProperty(bean, "userId"));
		
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			throw(new RuntimeException(e.getMessage()));
		}
		
	} 
	
	/**
	 * object bump for debug
	 * @param bean
	 * @return readable string bump
	 */
	static public String dump(Object bean){
		return ReflectionToStringBuilder.toString(bean);
	}
	
	
	
	
}
