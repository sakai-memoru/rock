package org.rock.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * Config
 * @author sakai.mitsuru
 *
 */
public class Config {

	String propFileName = "src/rock.properties";
	Configuration conf;
	
	public Config() throws ConfigurationException{
		super();
		conf = new PropertiesConfiguration(propFileName);
	}
	
	/**
	 * get configuration from properties for sample
	 */
	public Map<String,String> getConfig(){
		Map<String,String> retMap = new HashMap<>();
		
		Iterator<String> keys = conf.getKeys();
		String key;
		while(keys.hasNext()){
			key = keys.next();
			System.out.println(key);
			retMap.put(key,conf.getString(key));
		}
		
		return retMap;
	}
	
	
	
}
