package com.jovan;

import java.util.regex.Pattern;

public class DateValidator {

    // https://www.baeldung.com/java-date-regular-expressions
    private static final Pattern DATE_PATTERN = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

    public static boolean validate(String dateAsString) {
        return DATE_PATTERN.matcher(dateAsString).matches();
    }
}
