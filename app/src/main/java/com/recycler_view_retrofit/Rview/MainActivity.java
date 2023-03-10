package com.recycler_view_retrofit.Rview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sanvalero.recycler_view_retrofit.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = (RecyclerView) findViewById(R.id.recyclerId);

        recycler.setLayoutManager(new GridLayoutManager(this, 3));

        listDatos = new ArrayList<String>();

        for (int i = 0; i <= 50; i++) {
            listDatos.add("Dato # " + i + " ");
        }

        AdapterDatos adapter = new AdapterDatos(listDatos);
        recycler.setAdapter(adapter);
    }
}