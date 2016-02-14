package org.rock.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;

public class MapUtil {
	
	/**
	 * Array*Array to Map
	 * @param aryAry
	 * @return
	 */
	@SuppressWarnings("unchecked")
	static public Map<String,String> toMapByVerticalArray(Object[][] aryAry){
		return (Map<String,String>)ArrayUtils.toMap(aryAry);
	}
	
	/**
	 * header array and value array to map.
	 * @param aryKeys
	 * @param aryValues
	 * @return
	 * FIXME Map<String,Object>�ł̕ԋp
	 * @throws IllegalArgumentException
	 */
	static public Map<String,String> toMapByHorizonArray(String[] aryKeys,String[] aryValues)
			throws IllegalArgumentException {
		Map<String,String> retMap = new HashMap<>();
		
		int lengthkeys = aryKeys.length;
		int lengthValues = aryValues.length;
		
		// CASE
		if(lengthkeys >= lengthValues){
			// LOOP
			int i = 0 ;
			for(String key:aryKeys){
				retMap.put(key, aryValues[i]);
				i = i + 1 ;
			}
		} else {
			throw new IllegalArgumentException("Input parameter array length are different.");
		}
		return retMap;
	}

}
