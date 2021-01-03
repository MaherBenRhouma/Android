package com.dsi32.Covid_Encyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Restauration extends AppCompatActivity implements View.OnClickListener{
    Button ed_bit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restauration);

        ed_bit = (Button) findViewById(R.id.ed_bit);
        ed_bit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ed_bit:
                Intent oio = new Intent(this, MainActivity.class);
                startActivity(oio);
        }
    }
}