package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private makananAdapter adapter;
    private ArrayList<makanan> makananArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        adapter = new makananAdapter(MainActivity.this, makananArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    void addData(){
        makananArrayList = new ArrayList<>();
        makananArrayList.add(new makanan("Bubur Sum Sum","Bubur kanji yang lembut di padukan gula aren yang legit", "9000", "gambar1"));
        makananArrayList.add(new makanan("Ayam Geprek","Ayam goreng tepung yang dicampur dengan sambal yang nikmat", "10000", "gambar2"));
        makananArrayList.add(new makanan("Roti bakar","Roti tawar dibakar dan diberikan parutan keju dan lelehan coklat", "14000", "gambar3"));
        makananArrayList.add(new makanan("Sate Ayam","Potongan ayam yang ditusuk dan dibakar hingga sempurna", "22000", "gambar4"));
    }
}

