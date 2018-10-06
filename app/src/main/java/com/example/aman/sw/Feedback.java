package com.example.aman.sw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Feedback extends AppCompatActivity {
    private static Button button_reportABug;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        ReportABugButton();
    }
    public void ReportABugButton() {
        button_reportABug = (Button) findViewById(R.id.btnReport_a_bug);
        button_reportABug.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.aman.sw.Report_a_Bug");
                        startActivity(intent);
                    }
                }
        );
    }
}
