package com.javalessions.values;

import java.text.NumberFormat;

public class PrimitiveValues {
    public static String getValueString() {
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
}
