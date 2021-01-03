package com.dsi32.Covid_Encyclopedia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Menu_Inscription extends AppCompatActivity implements View.OnClickListener {
    Button button;
    private EditText editTextName, editTextEmail, editTextPassword, editTextConfirm, editTextLastName;
    private FirebaseAuth mAuth;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__inscription);
        mAuth = FirebaseAuth.getInstance();
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        editTextName = (EditText) findViewById(R.id.ed_username);
        editTextLastName = (EditText) findViewById(R.id.ed_prénom);
        editTextEmail = (EditText) findViewById(R.id.ed_mail);
        editTextPassword = (EditText) findViewById(R.id.et_password);
        editTextConfirm = (EditText) findViewById(R.id.et_confirmer);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent iii = new Intent(this, MainActivity.class);
                startActivity(iii);

        }
    mAuth.createUserWithEmailAndPassword(name, motdepasse).addOnCompleteListener(new OnCompleteListener<AuthResult>(){
        @Override
        public void onComplete(@NonNull Task<AuthResult> task{
            if(task.isSuccessful()){
                User user = new user(Name,LastName,Email,Password,Confirm);
                firebaseDatabase.getInstance().getReference(path: "Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid))
                .setValue(user).addCompleteListener(new OnCompleteListener<void>(){
                    @Override
                    public void onComplete(@NonNull Task<void> task) {
                        if(task.isSuccessful()) {
                            Toast.makeText(context:RegisterUser.this, text:
                            "user has been registered", Toast.LENGTH_LONG).Show();
                        }
                        }
                    }
                })

        )

    }
}