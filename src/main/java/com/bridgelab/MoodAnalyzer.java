package com.bridgelab;
import java.util.regex.Pattern;
public class MoodAnalyzer {

    public static void main(String[] args) {
        System.out.println("welcome to junit testing programms");
    }

    public String checkSad(String string) {
        if(string.contains("sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }

    public boolean checkName(String name) {
        boolean value = Pattern.matches("[A-Z]{1}[a-zA-Z]+", name);
        return value;
    }

    public boolean checkMobileFormat(String mobileNumber) {
        boolean value = Pattern.matches("^\\+[0-9]{2}[ ][1-9][0-9]{9}$", mobileNumber);
        return value;
    }

    public boolean checkPassword(String password) {
        boolean value = Pattern.matches("(.{8,}[A-Z0-9]?[+.$#@!&%*]?)", password);
        return value;
    }
}
