package com.fdscout.web.util.tool;

import java.text.MessageFormat;
import java.util.Properties;

import com.fdscout.context.WebContext;

public class PropertyReader {

	   private static Properties properties;
	   
	    static {
	        if (properties == null) {
	            properties = (Properties)WebContext.getBean("packageProperties");
	        }
	    }
	 
	    public static String get(String key) {
	        return (String)properties.get(key);
	    }
	 
	    public static String get(String key, Object[] params) {
	        return MessageFormat.format(get(key), params);
	    }

}
