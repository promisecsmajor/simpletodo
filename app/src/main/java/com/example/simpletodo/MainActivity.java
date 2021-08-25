package com.example.simpletodo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> items;

    Button addBtn;
    EditText edItem;
    RecyclerView rvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = findViewById(R.id.addBtn);
        edItem = findViewById(R.id.edItem);
        rvItems = findViewById(R.id.rvItems);


        items = new ArrayList<>();
        items.add("Buy milk");
        items.add("Go to the gym");
        items.add("Code on leetcode");

        new itemsAdapter(items);
    }
}