package com.example.aman.sw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Button button_login;
    private static Button button_register;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper(this);
        RegisterButton();
        LoginButton();

    }

    public void RegisterButton()
    {
        button_register = (Button)findViewById(R.id.btnRegisterMain);

        button_register.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.aman.sw.Register");
                        startActivity(intent);
                    }
                }
        );
    }
    public void LoginButton()
    {
        button_login = (Button)findViewById(R.id.btnLogin);

        button_login.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.aman.sw.Login");
                        startActivity(intent);

                    }



                }
        );
    }
}
