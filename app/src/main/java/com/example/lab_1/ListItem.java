package com.example.lab_1;

public class ListItem {

    private String title;
    private int imageId;
    private String description;

    public ListItem() {
    }

    public ListItem (String title, int imageId, String description) {
        this.title = title;
        this.imageId = imageId;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle (String title){
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId (String imageId){  this.title = imageId; }

    public String getDescription() {
        return description;
    }

    public void setDescription (String description){
        this.title = description;
    }
}
