package com.example.st1drawermenu.Fragment.Tab4;

import android.graphics.drawable.Drawable;

public class Tab4_Model_Card {

    private Drawable imageCoffee;
    private String   textCoffee ;

    /*-----------------------------------------*/
    /*getter & setter*/

    public Drawable getImageCoffee() {
        return imageCoffee;
    }

    public void setImageCoffee(Drawable imageCoffee) {
        this.imageCoffee = imageCoffee;
    }

    public String getTextCoffee() {
        return textCoffee;
    }

    public void setTextCoffee(String textCoffee) {
        this.textCoffee = textCoffee;
    }

    /*-----------------------------------------*/
    /*toString*/

    @Override
    public String toString() {
        return "Tab4_Model_Card{" +
                "imageCoffee=" + imageCoffee +
                ", textCoffee='" + textCoffee + '\'' +
                '}';
    }

    /*-----------------------------------------*/
    /*constructor*/

    public Tab4_Model_Card() {
    }

    public Tab4_Model_Card(Drawable imageCoffee, String textCoffee) {
        this.imageCoffee = imageCoffee;
        this.textCoffee = textCoffee;
    }

}
