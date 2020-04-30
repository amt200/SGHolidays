package com.myapplicationdev.android.sgholidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvCategories;
    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCategories = findViewById(R.id.lvHolidayCategory);

        arrayList = new ArrayList<String>();

        arrayList.add("Secular");
        arrayList.add("Ethnic & Religion");

        arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);

        lvCategories.setAdapter(arrayAdapter);

        lvCategories.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected = arrayList.get(position);

                Intent intent = new Intent(MainActivity.this, HolidayActivity.class);

                intent.putExtra("category", selected);

                startActivity(intent);
            }
        });

    }
}
