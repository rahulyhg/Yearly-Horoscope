package com.example.corpit.horoscope2017.Entity;

/**
 * Created by Corp IT on 20/4/2017.
 */

public class Love {
    private String spinnerText;
    private int spinnerImage;

    public Love(String spinnerText,int spinnerImage){
        this.spinnerText=spinnerText;
        this.spinnerImage=spinnerImage;
    }

    public String getSpinnerText() {
        return spinnerText;
    }

    public void setSpinnerText(String spinnerText) {
        this.spinnerText = spinnerText;
    }

    public int getSpinnerImage() {
        return spinnerImage;
    }

    public void setSpinnerImage(int spinnerImage) {
        this.spinnerImage = spinnerImage;
    }
}
