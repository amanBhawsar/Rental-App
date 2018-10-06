package com.example.aman.sw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    private static Button button_manageCommodity;
    private static Button button_requestCommodity;
    private static Button button_commodityHistory;
    private static Button button_feedback;
    private static Button button_myCommodity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        ManageCommodityButton();
        requestCommodityButton();
        CommodityHistoryButton();
        MyCommodity();
        FeedbackButton();
    }
    public void ManageCommodityButton(){
        button_manageCommodity = (Button)findViewById(R.id.btnManageCommodity);
        button_manageCommodity.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.aman.sw.ManageCommodity");
                        startActivity(intent);
                    }
                }
        );
    }
    public void requestCommodityButton(){
        button_requestCommodity = (Button)findViewById(R.id.btnRequestCommodity);
        button_requestCommodity.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.aman.sw.RequestCommodity");
                        startActivity(intent);
                    }
                }
        );
    }
    public void CommodityHistoryButton(){
        button_commodityHistory = (Button)findViewById(R.id.btnCommodityHistory);
        button_commodityHistory.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.aman.sw.History");
                        startActivity(intent);
                    }
                }
        );
    }
    public void MyCommodity(){
        button_myCommodity = (Button)findViewById(R.id.btnMyCommodity);
        button_myCommodity.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.aman.sw.MyCommodity");
                        startActivity(intent);
                    }
                }
        );
    }
    public void FeedbackButton(){
        button_feedback = (Button)findViewById(R.id.btnFeedback);
        button_feedback.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.aman.sw.Feedback");
                        startActivity(intent);
                    }
                }
        );
    }



}
