package com.example.nunew2.StartUpPages;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nunew2.SupportClasses.HelperClass;
import com.example.nunew2.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
public class Signup_Screen extends AppCompatActivity {
    EditText signupName, signupUsername, signupEmail, signupPassword, signupPhoneNo;
    TextView loginRedirectText;
    Button signupButton;
    FirebaseDatabase database;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);
        signupName = findViewById(R.id.signup_name);
        signupEmail = findViewById(R.id.signup_email);
        signupPhoneNo = findViewById(R.id.signup_phoneNo);
        signupUsername = findViewById(R.id.signup_username);
        signupPassword = findViewById(R.id.signup_password);
        loginRedirectText = findViewById(R.id.loginRedirectText);
        signupButton = findViewById(R.id.signup_button);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users");
                String name = signupName.getText().toString();
                String email = signupEmail.getText().toString();
                String phoneNo = signupPhoneNo.getText().toString();
                String username = signupUsername.getText().toString();
                String password = signupPassword.getText().toString();
                HelperClass helperClass = new HelperClass(name, username, email, phoneNo, password);
                reference.child(username).setValue(helperClass);
                Toast.makeText(Signup_Screen.this, "Signup successfully!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Signup_Screen.this, Login_Screen.class);
                startActivity(intent);
            }
        });
        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup_Screen.this, Login_Screen.class);
                startActivity(intent);
            }
        });
    }
}