package com.example.divyanshukapoor.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Divyanshu_Kapoor on 07-Jul-17.
 */

public class Input extends AppCompatActivity implements View.OnClickListener {

    EditText et;
    Button b;
    String s;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);
        b=(Button)findViewById(R.id.button);
        et=(EditText)findViewById(R.id.edittext);
        tv=(TextView)findViewById(R.id.textView8);
        Animation a= AnimationUtils.loadAnimation(Input.this,R.anim.zoom_out);
        tv.startAnimation(a);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        s= et.getText().toString();
        if(s.equals("")){
            Toast.makeText(this,"Please enter city name", Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, MainActivity.class);
            i.putExtra("name", s);
            Toast.makeText(this, s, Toast.LENGTH_LONG).show();
            startActivity(i);
        }
    }
}
