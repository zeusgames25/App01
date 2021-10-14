package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.app01.adapters.NameAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        Log.i("Main App", "Segfunda actividad");

        // Intent intent = getIntent();
        // String value = intent.getStringExtra("value");

        //  TextView tv = findViewById(R.id.txtMensaje);
        //  tv.setText(value);

        RecyclerView rv = findViewById(R.id.rvNames);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        List<String> datos = Arrays.asList("dato1", "dato2", "dato3");
        NameAdapter adapter = new NameAdapter(datos);
        rv.setAdapter(adapter);

    }
}