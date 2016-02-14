package org.rock.util;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;

public class ListUtil {
	
	/**
	 * squeeze null from list
	 * @param lst
	 * @return
	 */
	static public List<? extends Object> squeeze(List<? extends Object> lst){
		lst.removeAll(Collections.singleton(null)); //null‚ðŠi”[‚·‚éset‚Åremove
		return lst;
	}
	
	/**
	 * list bump for debug
	 * @param lst
	 * @return readable string bump
	 */
	static public String dump(List<? extends Object> lst){
		return ArrayUtils.toString(lst.toArray());
	}
	

}
