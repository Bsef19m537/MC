package com.example.customlistviewapp;

public class person {

    Int image;
    String name;
    String des;

    public person(Int image, String name, String des) {
        this.image = image;
        this.name = name;
        this.des = des;
    }


    public Int getImage() {
        return image;
    }

    public void setImage(Int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
