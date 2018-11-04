package com.fdscout.core.util;

import java.security.MessageDigest;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import com.fdscout.core.model.bean.PhoneBean;

public class CoreUtility {
	public static String getRandomRxNumber() {
		int length = 10;
		return RandomStringUtils.randomNumeric(length);
	}
	
	public static Timestamp getCurrentTimestamp() {
		return new Timestamp(new Date().getTime());
	}
	
	public static java.util.Date getUtilToday() {
		return new Date();
	}
	
	public static java.sql.Date getSqlToday() {
		return new java.sql.Date(getUtilToday().getTime());
	}
	
	public static java.sql.Date getSqlNextday(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_YEAR,1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return new java.sql.Date(cal.getTimeInMillis());
	}
	
	public static java.sql.Date getStrToSqlDate(String dateStr, String formatter) {
		if(StringUtils.isBlank(dateStr)) {
			return null;
		}
		
		if(StringUtils.isBlank(formatter)) {
			formatter = "yyyy-MM-dd";
		}
		DateFormat df = new SimpleDateFormat(formatter);
		try {
			return new java.sql.Date(df.parse(dateStr).getTime());
		} catch (ParseException e) {
			
		}
		return null;
	}
	
	public static String getSqlDateToStr(java.sql.Date date) {
		if(date == null) {
			return "";
		}
		//return new java.sql.Date(getUtilToday().getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String text = sdf.format(date);
		return text;
	}

	public static String sha512(String base) {
		if (base == null) {
			return base;
		}
	    try{
	        MessageDigest digest = MessageDigest.getInstance("SHA-512");
	        byte[] hash = digest.digest(base.getBytes("UTF-8"));
	        StringBuffer hexString = new StringBuffer();

	        for (int i = 0; i < hash.length; i++) {
	            String hex = Integer.toHexString(0xff & hash[i]);
	            if(hex.length() == 1) hexString.append('0');
	            hexString.append(hex);
	        }
	        return hexString.toString();
	    } catch(Exception ex){
	    	throw new RuntimeException(ex);
	    }
	}
	
	public static boolean isEmpty (String string) {
		return string == null || string.trim().length() == 0;
	}
	
	public static String getFullFormattedPhoneNumber(PhoneBean phone) {
		StringBuilder phoneNumber = new StringBuilder();
		if (phone == null) {
			return "";
		}
		if (phone.getNumber().length() == 10) {
			phoneNumber.append("(" + phone.getNumber().substring(0,3) + ")" + 
									 phone.getNumber().substring(3,6) + "-" + 
									 phone.getNumber().substring(6));
		}
		else {
			phoneNumber.append(phone.getNumber());
		}
		if (!CoreUtility.isEmpty(phone.getExtention())) {
			phoneNumber.append(" ext. " + phone.getExtention());
		}
		return phoneNumber.toString();
	}
	
	public static String getLogicCodeFromDrugName(String drugName) {
		if (drugName != null) {
			String logicCode = drugName.replaceAll(" ", "");
			return logicCode.substring(0, 1).toLowerCase() + logicCode.substring(1);
		}
		else {
			return "";
		}
	}

	public static String generateOTP() {
		String numbers = "0123456789";
		Random random = new Random();
		int len = 6;
		char[] otp = new char[len];
		for (int i = 0; i < len; i++) {
			otp[i] = numbers.charAt(random.nextInt(numbers.length()));
		}
		return new String(otp);
	}
	
	public static String formatFloat(float floatNumber) {
		if (floatNumber % 1.0 != 0) {
			return String.format("%s", floatNumber);
		}
		else {
			return String.format("%.0f", floatNumber);
		} 
	}
}
