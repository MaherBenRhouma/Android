package com.dsi32.Covid_Encyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Presentation extends AppCompatActivity implements View.OnClickListener {
    TextView ed_mee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation);

        ed_mee = (TextView) findViewById(R.id.ed_mee);
        ed_mee.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ed_mee:
                Intent ivvvvv = new Intent(this, Menu.class);
                startActivity(ivvvvv);

        }

    }
}