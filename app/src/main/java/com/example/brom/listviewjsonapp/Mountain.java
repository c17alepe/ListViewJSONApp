package com.example.brom.listviewjsonapp;

public class Mountain {
    private String name;
    private String location;
    private int height;


    public Mountain(String setName, String setLocation, int setHeight){
        name = setName;
        location = setLocation;
        height = setHeight;
    }

    public String toString() {
        return name;
    }

    public String getName(){
        return name;
    }

    public String info(){
        String info=name;
        info+=" is a part of the ";
        info+=location;
        info+=" mountain range and is ";
        info+=Integer.toString(height);
        info+="m high.";
        return info;
    }

}