package com.practice.lionepart7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Recycler extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerAdapter recyclerAdapter;
    List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recyclerView = findViewById(R.id.recyclerId);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        itemList = new ArrayList<>();
        itemList = fillTheList();
        recyclerAdapter = new RecyclerAdapter(this, itemList);
        recyclerView.setAdapter(recyclerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.second_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        startActivity(new Intent(this, MainActivity.class));
        return super.onOptionsItemSelected(item);
    }

    private void callDialog() {
    }

    private List<Item> fillTheList() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.starttimes, "StartTimes", "StarTimes offers digital terrestrial television and satellite television services to consumers, and provides technologies to countries and broadcasters that are switching from analog to digital television", 30000));
        itemList.add(new Item(R.drawable.netflix, "Netflix", "it offers a library of films and television series through distribution deals as well as its own productions, known as Netflix Originals.", 20000));
        itemList.add(new Item(R.drawable.cnn, "CNN", "The Cable News Network is a multinational news-based pay television channel headquartered in Atlanta, United States", 60000));
        itemList.add(new Item(R.drawable.caanal, "CanalPlus", ". The channel broadcasts several kinds of programming, mostly encrypted. Unencrypted programming can be viewed free of charge on Canal+ and on satellite on Cana", 70000));
        itemList.add(new Item(R.drawable.appletv, "Apple Tv", "Browse all movies, TV shows, and more from Apple TV+. Watch all Apple Originals here and on the Apple TV app across your devices.", 640000));
        return itemList;
    }
}