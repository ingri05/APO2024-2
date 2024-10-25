package com.example.demoinicial.model;

public class User {
    private final String name;
    private final String code;
    private final double score;


    public User(String code, String name, double score) {
    this.name = name;
    this.code = code;
    this.score = score;
    }

    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public double getScore() {
        return score;
    }
    public String toString(){
        return name + " " + code + " " + score;
    }
}
