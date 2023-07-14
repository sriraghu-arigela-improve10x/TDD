package com.improve10x.nameInverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameInverter {
    public String invertName(String name) {
        if (name.equals("")) {
            return "";
            //else if (name.contains(" ")) {
            //            return name;
           // else if (!name.trim().contains(" "))
        } else if (isSingleWord(name)) {
            return name.trim();
        } else {
            return formatMultiElementName(name);
        }
    }

    private static boolean isSingleWord(String name) {
        return !name.trim().contains(" ");
    }

    private static String formatMultiElementName(String name) {
        //String [] names = name.trim().split("\\s+");
        ArrayList<String> names = new ArrayList<>(Arrays.asList(name.trim().split("\\s+")));
        removeHonorifics(names);
        String postNominal = getPostNominal(names.subList(2, names.size()));
        //String postNominal = (names.size() > 2) ? names.get(2) : "";
        return (names.get(1) + ", " + names.get(0) + " " + postNominal).trim();
        //names = ["first", "last"]
        //return names[1] + ", " + names[0];
        //return names.get(1) + ", " + names.get(0);
    }

    private static String getPostNominal(List<String> postNominalList) {
        String postNominal = "";
        //if (names.size() > 2) {
            for(int i = 0; i < postNominalList.size(); i++) {
                postNominal += postNominalList.get(i) + " ";
            //}
        }
        return postNominal;
    }

    private static void removeHonorifics(ArrayList<String> names) {
        if (hasHonorifics(names) && names.size() > 2) {
            names.remove(0);
        }
    }

    private static boolean hasHonorifics(ArrayList<String> names) {
        return names.get(0).matches("Mrs.|Mr.|miss.");
    }
}


