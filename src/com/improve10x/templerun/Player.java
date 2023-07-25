package com.improve10x.templerun;

public class Player {

    private String name;
    private int health;

    private int score;
    private int totalCollectCoin;
    public Player(String name) {
        /*if (name == null) {
            this.name = "";
        } else {
            this.name = name;
        }*/
        //or
        /*this.name =( name == null) ? "" : name.trim();
        this.health = 100;
        this.score = 0;*/
        //after
        this(name, 100);
    }

    public Player(String name, int health) {
        this.name =( name == null) ? "" : name.trim();
        if(health < 0 || health > 100) {
            throw new  InvalidHealthException();
        }
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void run() {
        System.out.println("Running...!");
    }

    public int getScore() {
        score = totalCollectCoin;
        return score;
    }

    public void collectCoins(Coin coin) {
        this.totalCollectCoin += coin.getValue();
    }

    public void jump() {
        System.out.println(name + " jumped to avoid obstacles!");
    }

    public class InvalidHealthException extends RuntimeException {
    }
}
