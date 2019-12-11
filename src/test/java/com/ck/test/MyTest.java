package com.ck.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.ck.utils.DateUtil;
import com.ck.utils.StringUtil;

public class MyTest {
	
	@Test//根据传入的日期获取年龄
	public void Test1(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date format;
		try {
			format = sdf.parse("2000-12-05");
			Calendar instance = Calendar.getInstance();
			instance.setTime(format);
			int age = DateUtil.getAge(instance);
			System.out.println(age);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test//根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	public void Test2(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date format;
		try {
			format = sdf.parse("2019-09-19 19:29:39");
			Calendar instance = Calendar.getInstance();
			instance.setTime(format);
			DateUtil.initDateTime(instance);
			Date time = instance.getTime();
			String format2 = sdf.format(time);
			System.out.println(format2);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test//根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	public void Test3(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date format;
		try {
			format = sdf.parse("2019-09-19 19:29:39");
			Calendar instance = Calendar.getInstance();
			instance.setTime(format);
			DateUtil.setToLastDateOfMonth(instance);
			Date time = instance.getTime();
			String format2 = sdf.format(time);
			System.out.println(format2);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void Test4(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date format;
		try {
			format = sdf.parse("2020-09-19");
			Calendar instance = Calendar.getInstance();
			instance.setTime(format);
			int day = DateUtil.getFutrueDays(instance);
			
			System.out.println(day);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void Test5(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date format;
		try {
			format = sdf.parse("2018-09-19");
			Calendar instance = Calendar.getInstance();
			instance.setTime(format);
			int day = DateUtil.getPastDays(instance);
			
			System.out.println(day);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
