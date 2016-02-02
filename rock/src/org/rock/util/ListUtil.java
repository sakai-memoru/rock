package org.rock.util;

import java.util.List;

import org.apache.commons.lang.ArrayUtils;

public class ListUtil {
	
	/**
	 * squeeze empty elements in list
	 * @param lst
	 * @return readable string bump
	 */
//	static public List<? extends Object> squeezeEmpty(List<? extends Object> lst){
//		
//		
//		
//		return ArrayUtils.toString(lst.htoArray());
//	}
	/**
	 * list bump for debug
	 * @param lst
	 * @return readable string bump
	 */
	static public String dump(List<? extends Object> lst){
		return ArrayUtils.toString(lst.toArray());
	}

}
