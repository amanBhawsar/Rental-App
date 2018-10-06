package com.example.aman.sw;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private static Button button_login;
   // DatabaseHelper myDb;
    //SQLiteDatabase sqLiteDatabase;
    EditText editEmail,editPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       // myDb = new DatabaseHelper(this);
        LoginButton();
    }
    public void LoginButton() {
        button_login = (Button) findViewById(R.id.btnLogin);
        editEmail = (EditText)findViewById(R.id.editTextEmailLogin);
        editPassword = (EditText)findViewById(R.id.editTextPasswordLogin);
        button_login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        /*myDb= new DatabaseHelper(getApplicationContext());
                        sqLiteDatabase=myDb.getReadableDatabase();
                        Cursor cursor = myDb.getSelectedDataUsers(editEmail.getText().toString());
                        if(cursor.moveToFirst()){
                            String check_password = cursor.getString(0);
                            if(check_password == editPassword.getText().toString())
                            {
                                Intent intent = new Intent("com.example.aman.sw.HomePage");
                                startActivity(intent);
                            }

                            else
                            {
                                Toast.makeText(Login.this,"Data incorrect",Toast.LENGTH_LONG).show();
                            }
                        }

                        else
                        {
                            Toast.makeText(Login.this,"User is not registered",Toast.LENGTH_LONG).show();
                        }
*/
                        Intent intent = new Intent("com.example.aman.sw.HomePage");
                        startActivity(intent);
                    }
                }
        );
    }
}
