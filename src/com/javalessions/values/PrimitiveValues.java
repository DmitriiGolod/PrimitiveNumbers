package com.javalessions.values;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrimitiveValues {

    public static String getOutputValue() {
        var outputString="Initial String";

        long longValue=10000000;
        var formatter=NumberFormat.getNumberInstance();
        outputString=formatter.format((longValue));
        return outputString;
    }

    public static String mergeStrings(String... sArray) {

        StringBuilder sb = new StringBuilder();

        for (String s: sArray) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static Boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    public static String parseString(String sInput) {
        StringBuilder sParsed = new StringBuilder(sInput);

        return sParsed.toString();
    }

    public static String getLocalTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;

        return dtf.format(LocalDateTime.now());
    }
}
