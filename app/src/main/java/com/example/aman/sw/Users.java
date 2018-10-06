package com.example.aman.sw;

public class Users {


    int user_id;
    String name;
    String email;
    String address;
    String city;
    String phone;
    String password;

    //constructors

    public Users(){

    }

    //set methods

    public void setUser_id(int user_id){

        this.user_id = user_id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setPassword(String password){
        this.password = password;
    }



    //get methods



    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getAddress(){
        return this.address;
    }

    public String getCity(){
        return this.city;
    }

    public String getPhone(){
        return this.phone;
    }


}
