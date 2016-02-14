package org.rock.util;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.google.gson.Gson;

/**
 * DumpUtil
 */
public class DumpUtil {
	
	static String dump(Object obj){
		StringBuilder sb = new StringBuilder();
		
		if(obj.getClass().isInstance(String.class)){
			sb.append(obj);
		}else if(obj.getClass().isArray()){
			Object[] ary = (Object[])obj;
			sb.append(Arrays.deepToString(ary));
		} else {
			if(obj instanceof List<?>){
				List<?> lst = (List<?>)obj;
				for(Object o :lst){
					sb.append(DumpUtil.dump(o));
				}
			}else {
				sb.append(ReflectionToStringBuilder.toString(obj));
				
			}
		}
		return sb.toString();
	}
	
	static String toJson(Object obj){
		StringBuilder sb = new StringBuilder();
		
		Gson gson = new Gson();
		
		sb.append(gson.toJson(obj));

		return sb.toString();
	}
	
}
