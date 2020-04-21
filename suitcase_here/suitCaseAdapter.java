package com.example.bca_mca_notes.suitcase_here;

public class suitCaseAdapter {
    public int image;
    public  String name;

    public suitCaseAdapter(int image, String name) {
        this.image = image;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
