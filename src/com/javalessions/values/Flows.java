package com.javalessions.values;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flows {
    public static void runList() {
        String sResult="";

        List<String> list = new ArrayList<>();

        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.add("Alaska");
        System.out.println(list);

    }

    public static void runMap() {
         Map<String, String> map = new HashMap<>();

        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");

        System.out.println(map);

        String cap = map.get("Oregon");
        System.out.println("The capital of Oregon is "+cap);
    }

}
