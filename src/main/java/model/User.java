package main.java.model;

public class User {

    public String name;
    public String id;

    public User(String name){
        this.name = name;
        this.id = ""+Math.random();
    }
}