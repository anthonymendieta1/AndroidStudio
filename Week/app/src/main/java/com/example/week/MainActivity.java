package com.example.week;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1= (EditText) findViewById(R.id.editTextTime);

    }
    public boolean validar()  {
        boolean retorno = true;
        String tv = tv1.getText().toString();
        if (tv.isEmpty()) {
            tv1.setError("Ingrese un número");;
            retorno = false;
        }

        return retorno;

    }
    public void BotonCheck (View view) {
             if (validar()) {
             }

        Intent BotonCheck= new Intent(this, SegundaActivity.class);
        startActivity(BotonCheck);
    }
}