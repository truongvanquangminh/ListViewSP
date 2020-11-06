package com.example.listandgrid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListviewBaseAdapter adapter;
    ArrayList<ListviewModel> listviewData;

   private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        listviewData = new ArrayList<>();

        listviewData.add(new ListviewModel(R.drawable.anh, "Product", "Free Ship", "$234.00", "80 Reviews", "2.0"));
        listviewData.add(new ListviewModel(R.drawable.anh, "Product", "Free Ship", "$234.00", "80 Reviews", "2.0"));
        listviewData.add(new ListviewModel(R.drawable.anh, "Product", "Free Ship", "$234.00", "80 Reviews", "2.0"));
        listviewData.add(new ListviewModel(R.drawable.anh, "Product", "Free Ship", "$234.00", "80 Reviews", "2.0"));
        listviewData.add(new ListviewModel(R.drawable.anh, "Product", "Free Ship", "$234.00", "80 Reviews", "2.0"));

        adapter = new ListviewBaseAdapter(this, listviewData);

        listView.setAdapter(adapter);
    }

}