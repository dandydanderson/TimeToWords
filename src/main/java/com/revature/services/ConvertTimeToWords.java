package com.revature.services;

import org.springframework.stereotype.Service;

@Service
public class ConvertTimeToWords {
	
	
	
	/**
	 * Method that when given an hour integer and minute integer returns the time in a word format.
	 * @param h the hour 
	 * @param m the minute
	 * @return  returns the time in words
	 */
	  public String timeInWords(int h, int m) {
	       
          
       int mChecker = m;  
      
       if (m > 30){
         h = h+1;  
         m = 60 - m;        
       }
      
   String minute = "";
   String hour = "";
      
       switch (h){
           case 1:
               hour = "one";
               break;
           case 2:
               hour = "two";
               break;
           case 3:
               hour = "three";
               break;
           case 4:
               hour = "four";
               break;
           case 5:
               hour = "five";
               break;
           case 6:
               hour = "six";
               break;
           case 7:
               hour = "seven";
               break;
           case 8:
               hour = "eight";
               break;
           case 9:
               hour = "nine";
               break;
           case 10:
               hour = "ten";
               break;
           case 11:
               hour = "eleven";
               break;
           case 12:
               hour = "twelve";
               break;
           case 13:
               hour = "one";
               break;
              
       }
  
   switch (m){
           case 0:
           minute = "o' clock";
               break;
           case 1:
           minute = "one minute";
               break;
           case 15:
           minute = "quarter";
               break;
           case 30:
           minute = "half";
               break;
           case 45:
           minute = "quarter";
               break;  
           case 11:
           minute = "eleven minutes";
                break;
           case 12:
           minute = "twelve minutes";
                 break;
           case 13:
           minute = "thirteen minutes";
                break;
           case 14:
           minute = "fourteen minutes";
                break;
           case 16:
           minute = "sixteen minutes";
                break;
           case 17:
           minute = "seventeen minutes";
                break;
           case 18:
           minute = "eighteen minutes";
                break;
           case 19:
           minute = "nineteen minutes";
                break;
   }
      
       if (minute.equals(" ")){
          
           int minuteOnes = m%10;
           int minuteTens = m/10;
          
           String strMinOnes = "";
           String strMinTens = "";
          
           switch (minuteOnes){
               case 1:
                   strMinOnes = "one minutes";
                   break;
               case 2:
                   strMinOnes = "two minutes";
                   break;
               case 3:
                   strMinOnes = "three minutes";
                   break;
               case 4:
                   strMinOnes = "four minutes";
                   break;
               case 5:
                   strMinOnes = "five minutes";
                   break;
               case 6:
                   strMinOnes = "six minutes";
                   break;
               case 7:
                   strMinOnes = "seven minutes";
                   break;
               case 8:
                   strMinOnes = "eight minutes";
                   break;
               case 9:
                   strMinOnes = "nine minutes";
           }
          
                       switch (minuteTens){
               case 0 :
                   strMinTens = "";
                   break;
               case 2:
                   strMinTens = "twenty";
                   break;
           }
          
           if (strMinTens != ""){
           minute = strMinTens + " " + strMinOnes;
           }
           else {
               minute = strMinOnes;
           }
          
       }
      
      
       if (mChecker == 0){
           return hour + " " + minute;
       }
       else if (mChecker<=30) {
           return minute + " " +"past" + " " + hour;
       }
       else {
           return minute + " " + "to" + " " + hour;
       }

   }
	
	

}
