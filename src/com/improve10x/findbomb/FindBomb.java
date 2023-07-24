package com.improve10x.findbomb;

public class FindBomb {
    public String findTheBomb(String name) {
        String result = "";
        if(name == null) {
            return "null";
        } else if (name == "") {
            return "";
        }
        String textInLowerCase;
        textInLowerCase = name.toLowerCase();
        if(textInLowerCase.contains("bomb")){
            result = "DUCK!";
        } else {
        result = "Relax, there's no bomb.";
    }
        return result;
    }
}


