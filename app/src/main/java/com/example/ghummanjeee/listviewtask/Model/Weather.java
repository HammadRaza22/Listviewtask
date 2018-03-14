package com.example.ghummanjeee.listviewtask.Model;

/**
 * Created by GhummanJeee on 3/13/2018.
 */

public class Weather {
    String city;
    String temperature;
    int image;

    public int getImage(int id) {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    public String getTemperature(String s) {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }



}
