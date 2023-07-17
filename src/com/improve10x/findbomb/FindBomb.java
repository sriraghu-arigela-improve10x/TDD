package com.improve10x.findbomb;

public class FindBomb {
    public String CheckWord(String name) {
        String result = "";
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


