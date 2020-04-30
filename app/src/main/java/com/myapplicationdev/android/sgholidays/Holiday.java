package com.myapplicationdev.android.sgholidays;

public class Holiday {

    private String date;
    private String name;
    private int imageID;

    public Holiday(String date, String name, int imageID) {
        this.date = date;
        this.name = name;
        this.imageID = imageID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

}
