package com.dsi32.Covid_Encyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Accueil extends AppCompatActivity implements View.OnClickListener{
    TextView ed_menu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        ed_menu1 = (TextView) findViewById(R.id.ed_menu1);
        ed_menu1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ed_menu1:
                Intent ivvv = new Intent(this, Menu.class);
                startActivity(ivvv);

        }
    }
}