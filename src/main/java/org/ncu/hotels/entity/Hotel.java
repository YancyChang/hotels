package org.ncu.hotels.entity;

/**
 * Created by YancyChang on 2019/3/15.
 */
public class Hotel {
    private int id;
    private String hotelName;
    private float score;
    private int price;
    private String location;
    private String pictureLink;
    private String link;

    public Hotel() {
    }

    public Hotel(int id,String hotelName, float score, int price, String location, String pictureLink, String link) {
        this.id = id;
        this.hotelName = hotelName;
        this.score = score;
        this.price = price;
        this.location = location;
        this.pictureLink = pictureLink;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String gethotelName() {
        return hotelName;
    }

    public void sethotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPictureLink() {
        return pictureLink;
    }

    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
