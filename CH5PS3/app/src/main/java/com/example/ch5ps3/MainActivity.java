package com.example.ch5ps3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact c1 = new Contact(1,"9898989898","Sample Name");
    Contact c2 = new Contact(1,"9898989898","Sample Name");
    Contact c3 = new Contact(1,"9898989898","Sample Name");
    Contact c4 = new Contact(1,"9898989898","Sample Name");
    Contact c5 = new Contact(1,"9898989898","Sample Name");
    Contact c6 = new Contact(1,"9898989898","Sample Name");
    Contact c7 = new Contact(1,"9898989898","Sample Name");
    Contact c8 = new Contact(1,"9898989898","Sample Name");
    Contact c9 = new Contact(1,"9898989898","Sample Name");

    Contact[] contacts = {c1,c2,c3,c4,c5,c6,c7,c8,c9};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}