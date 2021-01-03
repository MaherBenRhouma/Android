package com.dsi32.Covid_Encyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actualites extends AppCompatActivity implements View.OnClickListener{
    TextView ed_me;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualites);

        ed_me = (TextView) findViewById(R.id.ed_me);
        ed_me.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ed_me:
                Intent ivvvv = new Intent(this, Menu.class);
                startActivity(ivvvv);

        }

    }
}