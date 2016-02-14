package org.rock.util;

import java.text.SimpleDateFormat;

import org.apache.commons.beanutils.Converter;

public final class CustomStringConverter implements Converter {

	@SuppressWarnings("unchecked")
	public Object convert(Class<T> type, Object value) {
		if (value == null) {
			return ((String) null);
		} else {
			if (value instanceof java.util.Date) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				return sdf.format((java.util.Date) value);
			}
			return (value.toString());
		}
	}
}
