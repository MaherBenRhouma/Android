package com.dsi32.Covid_Encyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class a_propos extends AppCompatActivity implements View.OnClickListener{
    Button ed_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_propos);

        ed_back = (Button) findViewById(R.id.ed_back);
        ed_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ed_back:
                Intent it = new Intent(this, Menu.class);
                startActivity(it);
        }
    }
}