package com.example.listandgrid;

public class ListviewModel {
    int image;
    String tenSP, freeShip, tienSP, reViews ;
    float ratingBar;

    public ListviewModel(int image, String tenSP, String freeShip, String tienSP, String reViews, String ratingBar) {
        this.image = image;
        this.tenSP = tenSP;
        this.freeShip = freeShip;
        this.tienSP = tienSP;
        this.reViews = reViews;
        this.ratingBar = Float.parseFloat(ratingBar);
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getFreeShip() {
        return freeShip;
    }

    public void setFreeShip(String freeShip) {
        this.freeShip = freeShip;
    }

    public String getTienSP() {
        return tienSP;
    }

    public void setTienSP(String tienSP) {
        this.tienSP = tienSP;
    }

    public String getReViews() {
        return reViews;
    }

    public void setReViews(String reViews) {
        this.reViews = reViews;
    }

    public float getRatingBar() {
        return ratingBar;
    }

    public void setRatingBar(float ratingBar) {
        this.ratingBar = ratingBar;
    }
}
