package com.example.aman.sw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManageCommodity extends AppCompatActivity {
    private static Button button_addCommodity;
    private static Button button_modifyCommodity;
    private static Button button_deleteCommodity;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_commodity);
        AddCommodityButton();
        ModifyCommodityButton();
        DeleteCommodityButton();
    }
    public void AddCommodityButton(){
        button_addCommodity = (Button) findViewById(R.id.btnAddCommodity);
        button_addCommodity.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.example.aman.sw.AddCommodity");
                        startActivity(intent);
                    }
                }
        );
    }
    public void ModifyCommodityButton(){
        button_modifyCommodity = (Button) findViewById(R.id.btnModifyCommodity);
        button_modifyCommodity.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.example.aman.sw.ModifyCommodity");
                        startActivity(intent);
                    }
                }
        );
    }
    public void DeleteCommodityButton(){
        button_deleteCommodity = (Button) findViewById(R.id.btnDeleteCommodity);
        button_deleteCommodity.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.example.aman.sw.DeleteCommodity");
                        startActivity(intent);
                    }
                }
        );
    }
}
