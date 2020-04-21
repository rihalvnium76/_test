package com.example.myapplication;

public class Icon {
    private String text;
    private int picID;
    public Icon(String text, int picID) {
        this.text = text; this.picID = picID;
    }
    public String getText() {
        return text;
    }
    public int getPicID() {
        return picID;
    }
}
