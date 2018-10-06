package com.example.aman.sw;

public class Commodity {

    int commodity_id;
    String name;
    String description;
    String photo;
    String category;
    int rent;
    int flag;
    String email;


    public Commodity(){

    }

    //setter methods

    public void setCommodity_id(int commodity_id){
        this.commodity_id = commodity_id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPhoto(String photo){
        this.photo = photo;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setRent(int rent){
        this.rent = rent;
    }
    public void setFlag(int flag){
        this.flag = flag;
    }

    public void setEmail(String email){
        this.email = email;
    }


    //getters

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String getPhoto(String photo){
        return this.photo;
    }

    public String getCategory(){
        return this.category;
    }

    public int getRent(){
        return this.rent;
    }

    public String getEmail() {
        return this.email;
    }
}
