package com.akhil.assignment;
import java.util.regex.*;    
import java.util.*;    
public class EmailValidation{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("kingcoolguy@domain.co.in");  
        emails.add("akhilvailala@domain.com");  
        emails.add("akhil.name@domain.com");  
        emails.add("akhi#@domain.co.in");  
        emails.add("king@domain.com");  
        emails.add("kingqueen@domaincom");  
        //Add invalid emails in list  
        emails.add("@yahoo.com");  
        emails.add("akhivailala#domain.com");  
        //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  
	
