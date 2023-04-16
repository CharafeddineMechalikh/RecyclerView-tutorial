package com.mechalikh.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Item> items = createItemList(); // Replace with your own data source
        ItemAdapter adapter = new ItemAdapter(items);
        recyclerView.setAdapter(adapter);
    }

    private List<Item> createItemList() {
        // Replace with your own data source
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item 1", "Description 1", "https://www.example.com/item1.jpg"));
        items.add(new Item("Item 2", "Description 2", "https://www.example.com/item2.jpg"));
        items.add(new Item("Item 3", "Description 3", "https://www.example.com/item3.jpg"));
        return items;
    }

}
