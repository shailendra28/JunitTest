package com.Junit;

import java.util.regex.Pattern;
/* creating class with name ValidaterUser
 */
public class ValidateUser {
    /* Taking Variable with the pattern
     */
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String EMAIL_PATTERN= "[0-9 a-z A-z]+([._+-][0-9 a-z A-Z]+)*"+"@([0-9 a-z A-Z][-]?)+[.][a-z A-Z]{2,4}([.][a-z A-Z]{2,4})?$";
    private static final String MOB_NUMBER = "^[1-9]{2}\\s{0,1}[0-9]{5}[0-9]{5}$";
    private static final String PASSWORDRULE1 = "[a-z]{8}";
    private static final String PASSWORDRULE2 =  "[a-z A-Z]{8}";
    private static final String PASSWORDRULE3 = "[0-9 a-z A-Z]{8}";
    private static final String PASSWORDRULE4 = "^(?=.?[A-Z])(?=(.[a-z]){1,})(?=[.]{1,})(?=1,})(?!.*\\s).{8,}$";

    public static boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }
}
