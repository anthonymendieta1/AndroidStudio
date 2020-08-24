package com.example.week;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView txtTesult;
    private Button btnResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Bundle extra = getIntent().getExtras();
       // int week=extra.getInt(key :"week", defaulValue e);
    }
    public void BotonStarAgain (View view) {

        Intent BotonStarAgain= new Intent(this, MainActivity.class);
        startActivity(BotonStarAgain);
    }
}