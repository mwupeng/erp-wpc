package com.erpSys.main.utils;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 常用的Utils
 * 
 * @author罗远辉
 * @version 1.0
 */
public class HabitUtils {
	/**
	 * 获取UUID去掉“-”符号
	 * 
	 * @return
	 */
	public static String getUUID() {
		String s = UUID.randomUUID().toString();
		// 去掉“-”符号
		return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
	}

	/**
	 * 获取时间
	 * 
	 * @return
	 */
	public static Date getDate() {
		return new Date();
	}

	/**
	 * 字符串转int
	 * 
	 * @param id
	 * @return
	 */
	public static Integer getInt(String id) {
		return Integer.parseInt(id);
	}

	/***
	 * 判断 String 是否是 int
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isInteger(String input) {
		Matcher mer = Pattern.compile("^[+-]?[0-9]+$").matcher(input);
		return mer.find();
	}

	/**
	 * 日期转换成字符串
	 * 
	 * @param date
	 * @return str yyyy-MM-dd HH:mm:ss
	 */
	public static String DateToStr(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = format.format(date);
		return str;
	}

	/**
	 * 日期转换成字符串
	 * 
	 * @param date
	 * @return stryyyy/MM/dd
	 */
	public static String DateToStr1(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String str = format.format(date);
		return str;
	}

	/**
	 * 日期转换成字符串
	 * 
	 * @param date
	 * @return stryyyy/MM/dd HH:mm:ss
	 */
	public static String DateToStr2(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String str = format.format(date);
		return str;
	}

	/**
	 * 字符串转换成日期
	 * 
	 * @param str
	 * @return date
	 */
	public static Date StrToDate(String str) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = format.parse(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 字符串转换成日期 y - M -d
	 * 
	 * @param str
	 * @return date
	 */
	public static Date StrToDate2(String str) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 获取当前的时间 精确到天 如 2017-11-12
	 * 
	 * @return
	 */
	public static Date getThatDay() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String str = format.format(new Date());
		return StrToDate2(str);
	}

	/**
	 * 不等于空 返回 true
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isStrNull(String str) {
		return str == null || str.length() <= 0 ? false : true;
	}

	/**
	 * 用于分页时排序 能自动把大写的转成小写 并且前面加_
	 * 
	 * @param str 要排序的字段
	 * @return
	 */
	public static String daxieTo_(String str) {
		String red = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == 0)
				red += str.substring(i, i + 1);
			else if (str.substring(i, i + 1).equals(str.substring(i, i + 1).toLowerCase()))
				red += str.substring(i, i + 1);
			else
				red += "_" + str.substring(i, i + 1).toLowerCase();
		}
		return red;
	}

	/**
	 * 获取某年某月的最后一天
	 * 
	 * @param year  年
	 * @param month 月
	 * @return
	 */
	public static String getLastDayOfMonth(int year, int month) {
		Calendar cal = Calendar.getInstance();
		// 设置年份
		cal.set(Calendar.YEAR, year);
		// 设置月份
		cal.set(Calendar.MONTH, month - 1);
		// 获取某月最大天数
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 设置日历中月份的最大天数
		cal.set(Calendar.DAY_OF_MONTH, lastDay);
		// 格式化日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String lastDayOfMonth = sdf.format(cal.getTime());

		return lastDayOfMonth;
	}

	/**
	 * 判断一个对象是否为空
	 * 
	 * @param obj 要判断的对象
	 * @return
	 */
	public static boolean isObjNull(Object obj) {
		return obj == null ? false : true;
	}

	/**
	 * 判断一个list集合对象是否为空
	 * 
	 * @param list 要判断的集合对象
	 * @return
	 */
	public static boolean isListNull(List<Object> list) {
		return list == null || list.size() <= 0 ? false : true;
	}

	/**
	 * 获取文件大小工具
	 * 
	 * @param fileS 文件大小
	 * @return
	 */
	public static String getFileSize(long fileS) {
		String size = "";
		DecimalFormat df = new DecimalFormat("#.00");
		if (fileS < 1024) {
			size = df.format((double) fileS) + "BT";
		} else if (fileS < 1048576) {
			size = df.format((double) fileS / 1024) + "KB";
		} else if (fileS < 1073741824) {
			size = df.format((double) fileS / 1048576) + "MB";
		} else {
			size = df.format((double) fileS / 1073741824) + "GB";
		}
		return size;
	}

}
