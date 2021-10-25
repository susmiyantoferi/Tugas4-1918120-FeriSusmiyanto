package com.example.recyclev_tugas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ContentAdapter adapter;
    private ArrayList<Content> contentArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recycle);
        adapter = new ContentAdapter(contentArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        contentArrayList = new ArrayList<>();
        contentArrayList.add(new Content("Lestari", "Sedang di kantor", R.drawable.ic_food_foreground));
        contentArrayList.add(new Content("Mega", "Sibuk", R.drawable.ic_pip_foreground));
        contentArrayList.add(new Content("Feri Susmiyanto", "Sedang Tidur", R.drawable.user));
        contentArrayList.add(new Content("Kurnia", "Hay saya menggunakan app", R.drawable.ic_pip_foreground));
        contentArrayList.add(new Content("Adi nanta", "Hanya panggilan darurat", R.drawable.ic_cat_foreground));
    }
}