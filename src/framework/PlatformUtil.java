package com.edu.iijnm.framework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.RandomStringUtils;

public class PlatformUtil {
	
	public static final String DATE_FULL_TIME = "dd-MM-yyyy HH:mm:ss";
	public static final String DATE_SHORT_TIME = "dd-MM-yyyy HH:mm";
	public static final String DATE = "dd-MM-yyyy";
	public static final String FULL_TIME = "HH:mm:ss";
	public static final String SHORT_TIME = "HH:mm";

	public static final String DATE_FULL_TIME12 = "dd-MM-yyyy hh:mm:ss a";
	public static final String DATE_SHORT_TIME12 = "dd-MM-yyyy hh:mm a";
	public static final String FULL_TIME12 = "hh:mm:ss a";
	public static final String SHORT_TIME12 = "hh:mm a";
	/** Format the date as 'dd/MON/yyyy hh:mm am'. Time is shown in 12 hours format. */ 
	public static final String DATE_TIME_FORMAT1 = "dd-MMM-yy hh:mm a";
	
	/** Format the date as 'dd-mm-yy hh:mm'. Time is shown in 24 hours format. */ 
	public static final String DATE_TIME_FORMAT2 = "dd-MM-yy hh:mm";

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy HH:mm");
	private static final SimpleDateFormat sdfa = new SimpleDateFormat("dd-MM-yy HH:mm");
	private static final SimpleDateFormat sdffull = new SimpleDateFormat(DATE_FULL_TIME);

	public static boolean isNotEmpty(String field){
		if(field != null && !field.equals("")){
			return true;
		}
		return false;
	}

	public static boolean isEmpty(String field){
		if(field == null || field.equals("")){
			return true;
		}
		return false;
	}
	
	public static boolean isNumeric(String field){
		if(field == null || field.equals("")) return false;
		String pattern = "^[0-9.]*$";
		return Pattern.matches(pattern, field);
	}
	
	public static String formatDate(Date date, String format, Locale locale){
		SimpleDateFormat formatter = new SimpleDateFormat(format, locale);
		return formatter.format(date);
	}
	
	public static Date getDate(String source) throws Exception {
		return sdf.parse(source);
	}
	
	public static Date getDate(String source,SimpleDateFormat format) throws Exception {
		return format.parse(source);
	}
	
	public static Date getArDate(String source) throws Exception {
		return sdfa.parse(source);
	}

	public static String format(Date date,String format){
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		return formatter.format(date);
	}
	
	
	/**
	 * This formula has been taken from http://www.movable-type.co.uk/scripts/latlong.html
	 * 
	 * @param lat1
	 * @param lon1
	 * @param lat2
	 * @param lon2
	 * @return distance between the two pairs of lat/lon in meters
	 */
	public static double getGreadCircleDistance(double lat1, double lon1, double lat2, double lon2) {
	 	
		int r = 6371; // km
		double dLat = Math.toRadians(lat2-lat1);
		double dLon = Math.toRadians(lon2-lon1);
		double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
		        Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * 
		        Math.sin(dLon/2) * Math.sin(dLon/2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
		double d = r * c;
		return d * 1000;
	}
	
	/**
	 * This method trims any empty string in array
	 * while making a comma seperated String
	 * @param sArray
	 * @return
	 */
	
    public static String getCommaSeperatedString(String[] sArray) {
    	StringBuffer sb = new StringBuffer(100);
        ArrayList<String> list = new ArrayList<String>();
        int index=0;
        String fullString = "";
        if (sArray == null || sArray.length == 0 ) {
        	return fullString;
        } 

        for (int i = 0; i < sArray.length; i++) {
        	if(isEmpty(sArray[i]))
        		continue;
        	else{
        		list.add(sArray[i].trim());
        	}
        }

        if(list.size()> 0){
    	   for(index=0;index<list.size()-1;index++) {
    		   sb.append(list.get(index));
    		   sb.append(",");
    	   }
    	   sb.append(list.get(index));
    	   fullString = sb.toString();
        }
        return fullString;
	}
    
    
    public static String getCommaSeperatedString(ArrayList<String>list) {
    	int index=0;
    	StringBuffer sb = new StringBuffer(100);
    	 String fullString = "";
    	 if(list.size()> 0){
      	   for(index=0;index<list.size()-1;index++) {
      		   if(list.get(index) == null ||list.get(index) == "")continue;
    		   sb.append(list.get(index));
    		   sb.append(",");
    	   }
    	   sb.append(list.get(index));
    	   fullString = sb.toString();
        }
        return fullString;
    	 }
   

    public static String[] getArrayFromCommaSeperatedString(String commaSeperatedString) {
    	String[] values = null;
    	if(commaSeperatedString != null && commaSeperatedString !=""){
    	values = commaSeperatedString.split(",");
    	}
    	
    	return values;
    }
    
    
    public static String encode(String stText)throws Exception {
    	if(PlatformUtil.isEmpty(stText)){
    		return null;
    	}
    	return toString( Base64.encodeBase64(stText.getBytes()) );
    }
    
    public static String decode(String stBase64Encoded)throws Exception {
    	if(PlatformUtil.isEmpty(stBase64Encoded)){
    		return null;
    	}
    	return toString( Base64.decodeBase64(stBase64Encoded.getBytes()) );
    }
    
    private static String toString(byte[] bytes)throws Exception {
    	StringBuilder sb = new StringBuilder(bytes.length);
    	for( byte b : bytes ) {
    		sb.append((char)b);
    	}
    	return sb.toString();
    }
    
    
	public static boolean isAlphanumeric(String field) {
		
		if(field == null || field == "") return false;
		if(field.matches("[a-zA-Z0-9]*")) return true;
		else return false;
	}
	
	/**
	 * Method to generate random number. Performance of this method is better
	 * than getRandomNumber. Use this if you need random number of length less
	 * than 10 characters.
	 * @param noOfDigits a number from 1 - 10. If noOfDigits is
	 * greater than 10 then returns 0. 
	 * @return Returns returns a random number from 0 - 2147483646. 
	 */
	public static int generateRandomNumber(int noOfDigits){
		int randomNo = 0;
		if(noOfDigits > 0  && noOfDigits <11){
			Random random = new Random();
			double baseNo = 10d;
			int lowerLimit = (int)Math.pow(baseNo, (double)(noOfDigits -1));
			int upperLimit = (int)(Math.pow(baseNo, (double)(noOfDigits))) -1;
			//log.info(" lower limit="+lowerLimit+" upper limit="+upperLimit);
			do{
				randomNo = random.nextInt(upperLimit);
			}while(randomNo < lowerLimit);
		}
		return randomNo;
	}	
	
	/**
	 * Method to generate random number. 
	 * @param noOfDigits 
	 * @return random number
	 */
	public static int getRandomNumber(int noOfDigits){
		return Integer.parseInt(RandomStringUtils.randomNumeric(noOfDigits));
	}
	/**
	 * Method to generate random alphanumeric string.
	 * @param noOfDigits
	 * @return
	 */
	public static String getRandomAlphaNumeric(int noOfDigits){
		return RandomStringUtils.randomAlphanumeric(noOfDigits);
	}
	
	/**
	 * Method to generate random alphabetic string.
	 * @param noOfDigits
	 * @return
	 */
	public static String getRandomAlphabets(int noOfDigits){
		return RandomStringUtils.randomAlphabetic(noOfDigits);
	}
	

	public static String stripAlphaFromAlphaNumeric(String alphanumeric) {
		String numeric = "";
		if(alphanumeric == null || alphanumeric == "") return alphanumeric;
			numeric = alphanumeric.replaceAll("[a-zA-Z]", "");
			return numeric;
	}
	
}
