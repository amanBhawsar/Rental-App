package com.example.aman.sw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private static Button button_submit;
    DatabaseHelper myDb;
    EditText editName,editEmail,editAddress,editPhone,editCity,editPassword,editCpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        myDb = new DatabaseHelper(this);
        SubmitButton();
    }
    public void SubmitButton() {
        button_submit = (Button) findViewById(R.id.btnRegister);
        editName = (EditText)findViewById(R.id.editTextName);
        editEmail = (EditText)findViewById(R.id.editTextEmailLogin);
        editAddress = (EditText)findViewById(R.id.editTextAddress);
        editPhone = (EditText)findViewById(R.id.editTextPhone);
        editCity = (EditText)findViewById(R.id.editTextCity);
        editPassword = (EditText)findViewById(R.id.editTextpswd);
        editCpassword = (EditText)findViewById(R.id.editTextcpswd);
        button_submit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isInserted = myDb.insertDataInUsers(editName.getText().toString(),
                                editEmail.getText().toString(),
                                editAddress.getText().toString(),editPhone.getText().toString(),
                                editCity.getText().toString(),
                                editPassword.getText().toString());
                        if(isInserted == true) {
                            Toast.makeText(Register.this, "Data Inserted", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent("com.example.aman.sw.Login");
                            startActivity(intent);
                        }
                        else
                            Toast.makeText(Register.this,"Data not Inserted",Toast.LENGTH_LONG).show();


                    }
                }
        );
    }
}
