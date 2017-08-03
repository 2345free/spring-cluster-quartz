package com.example.clusterquartz.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author tianyi
 *
 */
public class DateUtils {

	private static final String defaultPattern = "yyyy-MM-dd HH:mm:ss:SSS";

	public static String dateToString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat(defaultPattern);
		return format.format(date);
	}

	public static String dateToString(Date date, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}

}
