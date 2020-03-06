package com.example.materialtest;

/**
 * Model：
 * Description：
 * Author: 赖允翔
 * created：2020/3/6 11:23
 */
public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String apple, int apple1) {
        name=apple;
        imageId=apple1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
