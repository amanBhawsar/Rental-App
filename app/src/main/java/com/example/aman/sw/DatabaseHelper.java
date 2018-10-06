package com.example.aman.sw;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DatabaseHelper extends SQLiteOpenHelper{

    //Database Name
    public static final String DATABASE_NAME = "rentalapp.db";

    public static final int DATABASE_VERSION = 1;

    //Logcat tag
    private static final String DATABASE_LOG = "Database Helper";

    //Table Names

    private static final String TABLE_USERS = "users";

    private static final String TABLE_COMMODITIES = "commodities";

    private static final String TABLE_HISTORY = "history";


    //Users table column names

    private static final String key_users = "user_id";
    private static final String name_users = "name";
    private static final String email_users = "email";
    private static final String address_users = "address";
    private static final String city_users = "city";
    private static final String phone_users = "phone";
    private static final String password_users = "password";



    //commodities table column names

    private static final String key_commodities = "commodity_id";
    private static final String name_commodities = "commodity_name";
    private static final String description_commodities = "description";
    private static final String photo_commodities = "commodity_photo";
    private static final String category_commodities = "commodity_category";
    private static final String rent_commodities = "rent";
    private static final String flag_commodities = "commodity_flag";


    //history table column names

    private static final String key_history = "transaction_id";
    private static final String date_history = "transaction_date";
    private static final String duration_history = "transaction_duration";
    private static final String owner_history = "transaction_owner";
    private static final String renter_history = "transaction_renter";






    //table create statements



    //Users table create statement
    private static final String CREATE_TABLE_USERS = "CREATE TABLE " + TABLE_USERS +
            "(" + key_users + " INTEGER PRIMARY KEY, " + name_users + " TEXT," + email_users +
            " TEXT," + address_users + " TEXT," + city_users+ " TEXT," + phone_users + " TEXT," +
            password_users + " TEXT" + ")";





    //commodities table create statement
    private static final String CREATE_TABLE_COMMODITIES = "CREATE TABLE " + TABLE_COMMODITIES +
            "(" + key_commodities + " INTEGER PRIMARY KEY, " + name_commodities + " TEXT," + description_commodities +
            " TEXT," + photo_commodities + " TEXT," + category_commodities + " TEXT," + rent_commodities + " INTEGER," +
            flag_commodities + " INTEGER," + email_users + " TEXT" +  ")";







    //history table create statement
    private static final String CREATE_TABLE_HISTORY = "CREATE TABLE " + TABLE_HISTORY +
            "(" + key_history + " INTEGER PRIMARY KEY, " + owner_history + " TEXT," + renter_history +
            " TEXT," + date_history + " DATETIME," + duration_history + " INTEGER," + rent_commodities + ")";





    public DatabaseHelper(Context context){

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        //creating required tables
        db.execSQL(CREATE_TABLE_USERS);
        db.execSQL(CREATE_TABLE_COMMODITIES);
        db.execSQL(CREATE_TABLE_HISTORY);

        System.out.println("Tables created");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //on upgrade drop older tables

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COMMODITIES);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HISTORY);


        //create new tables

        onCreate(db);

    }



    /********creating Users******************/

    public boolean insertDataInUsers(String name,String email,String address,String city, String phone, String password ){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(name_users,name);
        contentValues.put(email_users,email);
        contentValues.put(address_users,address);
        contentValues.put(city_users,city);
        contentValues.put(phone_users,phone);
        contentValues.put(password_users,password);
        long result = db.insert(TABLE_USERS,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;

    }

    public Cursor getAllDataUsers() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_USERS,null);
        return res;
    }

    public Cursor getSelectedDataUsers(String email) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_USERS + "where email = " + email,null);
        return res;
    }







    /*****update and delete features are yet to be added****/






    /*****creating commodities**************/

    public boolean insertDataInCommodities(String email,String commodity_name,String commodity_description,String commodity_photo, String commodity_category, int commodity_rent ){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(email_users,email);
        contentValues.put(name_commodities,commodity_name);
        contentValues.put(description_commodities,commodity_description);
        contentValues.put(photo_commodities,commodity_photo);
        contentValues.put(category_commodities,commodity_category);
        contentValues.put(rent_commodities,commodity_rent);
        long result = db.insert(TABLE_COMMODITIES,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;

    }


    public Cursor getAllDataCommodities() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_COMMODITIES,null);
        return res;
    }

    public boolean updateDataCommodities(String id, int rent, int flag) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(rent_commodities,rent);
        contentValues.put(flag_commodities,flag);
        db.update(TABLE_COMMODITIES, contentValues, "ID = ",new String[] { id });
        return true;
    }

    public Integer deleteDataCommodities (String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_COMMODITIES, "ID = ",new String[] {id});
    }

}
