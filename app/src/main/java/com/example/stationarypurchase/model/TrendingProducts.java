package com.example.stationarypurchase.model;

public class TrendingProducts {
    Integer id;
    String imageurl;

    public TrendingProducts(Integer id,String imageurl){
       this.id = id;
       this.imageurl=imageurl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
