/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;

/**
 *
 * @author phamt
 */
public class FormatForm {
    public FormatForm(){
        
    }
    public static String StringInput = "^[a-zA-Z\\s]+";
    public static String StringPhone= "^[0-9]{10}$";
    public static boolean isValidPhoneNo(String iPhoneNo) {
        return iPhoneNo.matches(StringPhone);
        }
    ///Funtion to Format Name
    public static String toTitleCase(String givenString) {
        String[] arr = givenString.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String arr1 : arr) {
            sb.append(Character.toUpperCase(arr1.charAt(0))).append(arr1.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    /// Funtion to Check Datee
    public static boolean IsDateValid(String date) {
        final String DATE_FORMAT = "dd MM yyyy";
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

}
