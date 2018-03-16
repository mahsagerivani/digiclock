package com.example.lavan32428068.t4;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface f = Typeface.createFromAsset(getAssets(),"fonts/segment7.otf");
        TextView t1 = (TextView)findViewById(R.id.txt1);
        t1.setTypeface(f);

    }
    }

