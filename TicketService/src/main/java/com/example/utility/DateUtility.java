package com.example.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public  class DateUtility {
  public static String getddmmyyyyDate(String date){
    String pattern = "dd-MM-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String formatedDate = simpleDateFormat.format(date);
    return formatedDate;
  }
}
