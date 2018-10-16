package com.example.rindou11.listviewtest;

public class Fruit {
    private String fruitName;
    private int imageId;

    public Fruit(String fruitName,int imageId){
        this.fruitName=fruitName;
        this.imageId=imageId;
    }

    public String getFruitName(){
        return fruitName;

    }

    public int getImageId(){
        return imageId;

    }
}
