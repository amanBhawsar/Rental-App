package com.example.aman.sw;

public class HistoryDb {

    int transaction_id;
    String date;
    int duration;
    String owner;
    String renter;

    public HistoryDb(){

    }

    //setters

    public void setTransaction_id(int transaction_id){
        this.transaction_id = transaction_id;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public void setRenter(String renter){
        this.renter = renter;
    }



    //getters

    public int getTransaction_id(){
        return this.transaction_id;
    }

    public String getDate(){
        return this.date;
    }

    public int getDuration(){
        return this.duration;
    }

    public String getOwner(){
        return this.owner;
    }

    public String getRenter(){
        return this.renter;
    }
}
