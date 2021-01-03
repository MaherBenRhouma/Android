package com.dsi32.Covid_Encyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bt_connect;
    TextView textView2;
    TextView restaurer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_connect = (Button) findViewById(R.id.bt_connect);
        textView2 = (TextView) findViewById(R.id.textView2);
        bt_connect.setOnClickListener(this);
        textView2.setOnClickListener(this);
        restaurer = (TextView) findViewById(R.id.restaurer);
        restaurer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_connect:
                Intent i = new Intent(this, Welcome.class);
                startActivity(i);
                break;
            case R.id.textView2:
                Intent ii = new Intent(this, Menu_Inscription.class);
                startActivity(ii);
                break;
            case R.id.restaurer:
                Intent iio = new Intent(this, Restauration.class);
                startActivity(iio);
        }
    }
}