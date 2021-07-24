package com.pnb.credit;

import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  

class PNB_Credit{
	
	public static void main(String... args){
		System.out.println("Inside Main");
		Date date = Calendar.getInstance().getTime(); 
		dateToStringConv(date);


}

private static String dateToStringConv(Date date){
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
                String strDate = dateFormat.format(date);  
                return strDate; 
        
   }  
	
}
