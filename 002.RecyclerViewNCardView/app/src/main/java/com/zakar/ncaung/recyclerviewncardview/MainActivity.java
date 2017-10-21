package com.zakar.ncaung.recyclerviewncardview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.zakar.ncaung.recyclerviewncardview.adapter.UserAdapter;
import com.zakar.ncaung.recyclerviewncardview.model.plain.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<User> users = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

          /*Layout Manager
            1.Linear Layout Manager
            2.Grid Layout Manager
            3.Staggered Grid Layout Manager
        */
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.userRecycler);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);
        recyclerView.setHasFixedSize(true);//Fixed six (most use)
        users.add(new User("Aung Aung"));
        users.add(new User("Zaw Zaw"));
        users.add(new User("Aung Aung"));
        users.add(new User("Zaw Zaw"));
        users.add(new User("Aung Aung"));
        users.add(new User("Zaw Zaw"));
        users.add(new User("Aung Aung"));
        users.add(new User("Zaw Zaw"));
        users.add(new User("Aung Aung"));
        users.add(new User("Zaw Zaw"));
        users.add(new User("Aung Aung"));
        users.add(new User("Zaw Zaw"));


        UserAdapter adapter = new UserAdapter(users);
        recyclerView.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


}
