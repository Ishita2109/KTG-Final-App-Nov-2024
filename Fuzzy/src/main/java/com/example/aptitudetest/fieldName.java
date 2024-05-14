package com.example.aptitudetest;

public class fieldName {
    private String mResultsField []= {
            "Health Care",
            "Science","Culinary","Finance","Technology","Education","Communication","Business","Multimedia","Legal","Arts","Public Service",
            "Social Science","Engineering","Trade Vocations"};

    public String getDescription(int a) {
        return mResultsField[a];
    }
}
