package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public class BotonClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Log.i("MAIN_APP","Click en el Boton");
            TextView tv =  findViewById(R.id.tvSaludo);
            tv.setText("Arturo");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button = findViewById(R.id.BotonSaludar);
        button.setOnClickListener(new BotonClick());

    }
}