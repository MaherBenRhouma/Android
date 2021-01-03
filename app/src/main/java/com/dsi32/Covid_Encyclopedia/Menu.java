package com.dsi32.Covid_Encyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu extends AppCompatActivity implements View.OnClickListener {
    TextView ed_act;
    TextView ed_pre;
    TextView ed_prp;
    TextView ed_ac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ed_act = (TextView) findViewById(R.id.ed_act);
        ed_act.setOnClickListener(this);
        ed_pre = (TextView) findViewById(R.id.ed_pre);
        ed_pre.setOnClickListener(this);
        ed_prp = (TextView) findViewById(R.id.ed_prp);
        ed_prp.setOnClickListener(this);
        ed_ac = (TextView) findViewById(R.id.ed_ac);
        ed_ac.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ed_act:
                Intent ivi = new Intent(this, Actualites.class);
                startActivity(ivi);
                break;
            case R.id.ed_pre:
                Intent ive = new Intent(this, Presentation.class);
                startActivity(ive);
                break;
            case R.id.ed_prp:
                Intent ivee = new Intent(this, a_propos.class);
                startActivity(ivee);
                break;
            case R.id.ed_ac:
                Intent iveee = new Intent(this, Accueil.class);
                startActivity(iveee);
        }
    }
}