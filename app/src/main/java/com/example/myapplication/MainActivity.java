package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Icon> iconList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addIcon();
        RecyclerView rv = findViewById(R.id.rcView);
        rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rv.setAdapter(new IconAdapter(iconList));

        //Test New Code
    }
    void addIcon() {
        for(int i=0; i<5; ++i) {
            iconList.add(new Icon("picture1", R.drawable.p1));
            iconList.add(new Icon("picture2", R.drawable.p2));
        }
    }
}
