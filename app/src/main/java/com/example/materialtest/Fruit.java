package com.example.materialtest;

/**
 * Created by Administrator on 2018/3/8.
 */

public class Fruit {

    private String name;
    private int imageId;

    public Fruit(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {

        return name;
    }
}
